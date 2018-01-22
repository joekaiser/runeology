package mod.runeology.helpers;

import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public final class BlockHelpers {

	public static final PropertyDirection FACING = PropertyDirection.create("facing");

	public static BlockPos getBlockPosFromXYZ(double x, double y, double z) {
		return new BlockPos(new Vec3d(x, y, z));
	}

}
