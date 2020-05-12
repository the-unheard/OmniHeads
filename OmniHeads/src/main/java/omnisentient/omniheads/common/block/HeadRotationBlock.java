package omnisentient.omniheads.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.StateContainer;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import omnisentient.omniheads.common.init.OmniProperties;

public class HeadRotationBlock extends Block
{
	public static final VoxelShape SHAPE = Block.makeCuboidShape(3d, 0d, 3d, 13d, 9d, 13d);

	public HeadRotationBlock(Properties props)
	{
		super(props);
		this.setDefaultState(this.stateContainer.getBaseState().with(OmniProperties.ROTATION, 0));
	}

	@Override
	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
	{
		builder.add(OmniProperties.ROTATION);
	}

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext ctx)
	{
		return SHAPE;
	}

	@Override
	public BlockState getStateForPlacement(BlockItemUseContext ctx)
	{
		return this.getDefaultState().with(OmniProperties.ROTATION, rotationFrom(ctx.getPlayer()));
	}

	public static int rotationFrom(PlayerEntity player)
	{
		return MathHelper.floor(player.rotationYaw / 45f + 0.5f) & 7;
	}

	@Override
	public BlockRenderLayer getRenderLayer()
	{
		return BlockRenderLayer.CUTOUT;
	}
}