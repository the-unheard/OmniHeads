function initializeCoreMod()
{
	// Imports
	var Opcodes = Java.type("org.objectweb.asm.Opcodes");
	var IntInsnNode = Java.type("org.objectweb.asm.tree.IntInsnNode");
	var MethodInsnNode = Java.type("org.objectweb.asm.tree.MethodInsnNode");
	return {
		"ClientWorld#notifyBlockUpdate":
		{
			target:
			{
				type: "METHOD",
				class: "net.minecraft.client.world.ClientWorld",
				methodName: "func_184138_a",
				methodDesc: "(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/BlockState;Lnet/minecraft/block/BlockState;I)V"
			},
			transformer: function(node)
			{
				// We want to insert our code at the start of the method
				// Add instructions in reverse order, because insert adds to the start of the instruction list

				// Lastly, invoke our method with all of the parameters from the stack
				node.instructions.insert(new MethodInsnNode(Opcodes.INVOKESTATIC, "omnisentient/omniheads/coremod/OmniDelegates", "onBlockUpdate", "(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/BlockState;Lnet/minecraft/block/BlockState;I)V"));
				// Push the 4th local variable to the stack. Should be an integer
				node.instructions.insert(new IntInsnNode(Opcodes.ILOAD, 4));
				// Push the 3rd local variable to the stack. Should be a BlockState object
				node.instructions.insert(new IntInsnNode(Opcodes.ALOAD, 3));
				// Push the 2nd local variable to the stack. Should be a BlockState object
				node.instructions.insert(new IntInsnNode(Opcodes.ALOAD, 2));
				// Push the 1st local variable to the stack. Should be a BlockPos object
				node.instructions.insert(new IntInsnNode(Opcodes.ALOAD, 1));
				// Push the class instance to the stack
				node.instructions.insert(new IntInsnNode(Opcodes.ALOAD, 0));
				return node;
			}
		}
	};
}
