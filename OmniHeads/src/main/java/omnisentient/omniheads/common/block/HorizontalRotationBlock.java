package omnisentient.omniheads.common.block;

import java.util.Map;

import com.google.common.collect.Maps;

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
	public final Map<Direction, VoxelShape> shapes = Maps.newEnumMap(Direction.class);

	public HorizontalRotationBlock(Properties props, VoxelShape northShape)
	{
		super(props);
		this.setDefaultState(this.stateContainer.getBaseState().with(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH));
		shapes.put(Direction.NORTH, northShape);
		shapes.put(Direction.EAST, rotateShape(Direction.NORTH, Direction.EAST, northShape));
		shapes.put(Direction.SOUTH, rotateShape(Direction.NORTH, Direction.SOUTH, northShape));
		shapes.put(Direction.WEST, rotateShape(Direction.NORTH, Direction.WEST, northShape));
	}

	public HorizontalRotationBlock(Properties props)
	{
		super(props);
		this.setDefaultState(this.stateContainer.getBaseState().with(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH));
		shapes.put(Direction.NORTH, VoxelShapes.fullCube());
		shapes.put(Direction.EAST, VoxelShapes.fullCube());
		shapes.put(Direction.SOUTH, VoxelShapes.fullCube());
		shapes.put(Direction.WEST, VoxelShapes.fullCube());
	}

	public static VoxelShape rotateShape(Direction from, Direction to, VoxelShape shape)
	{
		VoxelShape[] buffer = new VoxelShape[]{ shape, VoxelShapes.empty() };
		int times = (to.getHorizontalIndex() - from.getHorizontalIndex() + 4) % 4;
		for (int i = 0; i < times; i++)
		{
			buffer[0].forEachBox((minX, minY, minZ, maxX, maxY, maxZ) -> buffer[1] = VoxelShapes.or(buffer[1], VoxelShapes.create(1-maxZ, minY, minX, 1-minZ, maxY, maxX)));
			buffer[0] = buffer[1];
			buffer[1] = VoxelShapes.empty();
		}
		return buffer[0];
	}

	@Override
	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
	{
		builder.add(BlockStateProperties.HORIZONTAL_FACING);
	}

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext ctx)
	{
		return this.shapes.getOrDefault(state.get(BlockStateProperties.HORIZONTAL_FACING), VoxelShapes.fullCube());
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

}