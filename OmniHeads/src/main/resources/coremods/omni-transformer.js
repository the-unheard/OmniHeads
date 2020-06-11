function initializeCoreMod()
{
	// Imports
	var Opcodes = Java.type("org.objectweb.asm.Opcodes");
	var ASMAPI = Java.type("net.minecraftforge.coremod.api.ASMAPI");
	var IntInsnNode = Java.type("org.objectweb.asm.tree.IntInsnNode");
	var FieldInsnNode = Java.type("org.objectweb.asm.tree.FieldInsnNode");
	var MethodInsnNode = Java.type("org.objectweb.asm.tree.MethodInsnNode");
	return {
		"Chunk#setBlockState":
		{
			target:
			{
				type: "METHOD",
				class: "net.minecraft.world.chunk.Chunk",
				methodName: "func_177436_a",
				methodDesc: "(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/BlockState;Z)Lnet/minecraft/block/BlockState;"
			},
			transformer: function(node)
			{
				var world = ASMAPI.mapField("field_76637_e");
				for(var itr = node.instructions.iterator(); itr.hasNext(); )
				{
					var insn = itr.next();
					if(insn.getOpcode() !== Opcodes.ALOAD || insn.var !== 11)
						continue;
					node.instructions.insertBefore(insn, new IntInsnNode(Opcodes.ALOAD, 0));
					node.instructions.insertBefore(insn, new FieldInsnNode(Opcodes.GETFIELD, "net/minecraft/world/chunk/Chunk", world, "Lnet/minecraft/world/World;"));
					node.instructions.insertBefore(insn, new IntInsnNode(Opcodes.ALOAD, 1));
					node.instructions.insertBefore(insn, new IntInsnNode(Opcodes.ALOAD, 9));
					node.instructions.insertBefore(insn, new IntInsnNode(Opcodes.ALOAD, 2));
					node.instructions.insertBefore(insn, new MethodInsnNode(Opcodes.INVOKESTATIC, "omnisentient/omniheads/coremod/OmniDelegates", "onBlockUpdate", "(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/BlockState;Lnet/minecraft/block/BlockState;)V"));
					break;
				}
				return node;
			}
		}
	};
}
