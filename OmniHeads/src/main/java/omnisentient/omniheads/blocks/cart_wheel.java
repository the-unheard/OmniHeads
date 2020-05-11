package omnisentient.omniheads.blocks;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class cart_wheel extends Block {

	public cart_wheel() {
		super(Properties.create(Material.IRON)
				.sound(SoundType.STONE)
		);
		setRegistryName("cart_wheel");
	}
	
	@Override
	public void onBlockPlacedBy (World world, BlockPos pos, BlockState state, @Nullable LivingEntity entity, ItemStack stack) {
		if (entity != null) {
			world.setBlockState(pos, state.with(BlockStateProperties.FACING, getFacingFromEntity(pos,entity)), 2);
		}
	}
	
	private static Direction getFacingFromEntity(BlockPos clickedBlock, LivingEntity entity) {
		return Direction.getFacingFromVector((float) (entity.posX - clickedBlock.getX()), (float) (entity.posY - clickedBlock.getY()), (float) (entity.posZ - clickedBlock.getZ()));
	}
	
	
	@Override
	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
		builder.add(BlockStateProperties.FACING);
	}
	
	@Override
	public BlockRenderLayer getRenderLayer() {
		return BlockRenderLayer.CUTOUT_MIPPED;
	}

   public static final DirectionProperty FACINGx = BlockStateProperties.FACING;
   private static final VoxelShape facingnorth = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 3.0D);
   private static final VoxelShape facingsouth = Block.makeCuboidShape(0.0D, 0.0D, 16.0D, 16.0D, 16.0D, 13.0D);
   protected static final VoxelShape facingeast = Block.makeCuboidShape(16.0D, 0.0D, 0.0D, 13.0D, 16.0D, 16.0D);
   protected static final VoxelShape facingwest = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 3.0D, 16.0D, 16.0D);
   protected static final VoxelShape facingdown = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.0D, 16.0D);
   protected static final VoxelShape facingup = Block.makeCuboidShape(0.0D, 16.0D, 0.0D, 16.0D, 13.0D, 16.0D);


   private VoxelShape getShape(BlockState p_220128_1_) {
      Direction direction = p_220128_1_.get(FACINGx);
      if (direction == Direction.NORTH) {
         return facingsouth;
      } else if (direction == Direction.SOUTH) {
         return facingnorth;
      } else if (direction == Direction.WEST){
    	  return facingeast;
      } else if (direction == Direction.EAST) {
    	  return facingwest;
      } else if (direction == Direction.UP) {
    	  return facingdown;
      }else if (direction == Direction.DOWN) {
    	  return facingup;
      }
      else {
    	  return facingnorth;
      }
   }

   public VoxelShape getCollisionShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
      return this.getShape(state);
   }

   public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
      return this.getShape(state);
   }


	
}
