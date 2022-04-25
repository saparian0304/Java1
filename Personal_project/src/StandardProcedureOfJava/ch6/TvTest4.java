package StandardProcedureOfJava.ch6;

class TvTest4 {
	public static void main(String args[]) {
		Tv[] tvArr = new Tv[3];	// 湲몄닿? 3??Tv媛泥?諛곗?
		
		// Tv 媛泥대? ??깊댁 Tv媛泥?諛곗댁 媛 ??? ???
		for (int i=0; i<tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10;	// tvArr[i]? channel? i+10? ???
		}
		
		for (int i=0; i<tvArr.length; i++) {
			tvArr[i].channelUp();	// tvArr[i]? 硫??瑜??몄?. 梨???1 利媛
			System.out.printf("tvArr[%d].channel=%d%n", i, tvArr[i].channel);
		}
		
	}	// main? ?
}


