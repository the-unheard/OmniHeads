package omnisentient.omniheads.common.util;

public final class OmniUtil
{
	private OmniUtil() {}

	public static float lerp(float start, float end, float prog)
	{
		return start + (end - start) * prog;
	}

	/*
	 * https://stackoverflow.com/questions/11696736/recreating-css3-transitions-cubic-bezier-curve
	 * https://math.stackexchange.com/questions/26846/is-there-an-explicit-form-for-cubic-b%C3%A9zier-curves
	 * https://www.gamedev.net/forums/topic/572263-bezier-curve-for-animation/
	 * 
	 * convert 2d bezier to 1d:
	 * https://math.stackexchange.com/questions/2571471/understanding-of-cubic-b%C3%A9zier-curves-in-one-dimension
	 */
	public static float bezierCubic1d(float anchor1, float anchor2, float progress)
	{
		float omp = 1f - progress;
		return 3 * omp * omp * progress * anchor1 + 3 * omp * progress * progress * anchor2 + progress * progress * progress;
	}
}