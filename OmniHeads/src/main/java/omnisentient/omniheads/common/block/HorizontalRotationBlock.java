package omnisentient.omniheads.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

public class HorizontalRotationBlock extends Block
{

	public final VoxelShape northShape, eastShape, southShape, westShape;
	
	public HorizontalRotationBlock(Properties props, VoxelShape north_shape)
	{
		super(props);
		this.setDefaultState(this.stateContainer.getBaseState().with(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH));
		this.northShape = north_shape;
		this.eastShape = rotateShape(Direction.NORTH, Direction.EAST, north_shape);
		this.southShape = rotateShape(Direction.NORTH, Direction.SOUTH, north_shape);
		this.westShape = rotateShape(Direction.NORTH, Direction.WEST, north_shape);	
	}
	
	public HorizontalRotationBlock(Properties props)
	{
		super(props);
		this.northShape = this.eastShape = this.southShape = this.westShape = VoxelShapes.fullCube();
	}

	@Override
	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
	{
		builder.add(BlockStateProperties.HORIZONTAL_FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockItemUseContext ctx)
	{
		return this.getDefaultState().with(BlockStateProperties.HORIZONTAL_FACING, ctx.getPlacementHorizontalFacing().getOpposite());
	}

	@Override
	public BlockRenderLayer getRenderLayer()
	{
		return BlockRenderLayer.CUTOUT;
	}
	
	// calculate shapes
	public static VoxelShape rotateShape(Direction from, Direction to, VoxelShape shape) {
		VoxelShape[] buffer = new VoxelShape[]{ shape, VoxelShapes.empty() };

		int times = (to.getHorizontalIndex() - from.getHorizontalIndex() + 4) % 4;
		for (int i = 0; i < times; i++) {
			buffer[0].forEachBox((minX, minY, minZ, maxX, maxY, maxZ) -> buffer[1] = VoxelShapes.or(buffer[1], VoxelShapes.create(1-maxZ, minY, minX, 1-minZ, maxY, maxX)));
			buffer[0] = buffer[1];
			buffer[1] = VoxelShapes.empty();
		}

		return buffer[0];
	}

	// set shapes
	public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext ctx)
	{
		Direction dir = state.get(BlockStateProperties.HORIZONTAL_FACING);
		switch(dir)
		{
		case NORTH:
			return this.northShape;
		case EAST:
			return this.eastShape;
		case SOUTH:
			return this.southShape;
		case WEST:
			return this.westShape;
		default:
			return VoxelShapes.fullCube();
		}
	}
}