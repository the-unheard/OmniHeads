package omnisentient.omniheads.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.World;

public class ToggleableHRBlock extends HorizontalRotationBlock
{
	public ToggleableHRBlock(Properties props, VoxelShape northShape)
	{
		super(props, northShape);
		this.setDefaultState(this.stateContainer.getBaseState().with(BlockStateProperties.OPEN, false));
	}

	public ToggleableHRBlock(Properties props)
	{
		super(props);
		this.setDefaultState(this.stateContainer.getBaseState().with(BlockStateProperties.OPEN, false));
	}

	@Override
	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
	{
		super.fillStateContainer(builder);
		builder.add(BlockStateProperties.OPEN);
	}

	@Override
	public boolean onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult hit)
	{
		if(world.isRemote)
			return true;
		world.setBlockState(pos, state.cycle(BlockStateProperties.OPEN));
		return true;
	}
}