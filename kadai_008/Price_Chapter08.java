package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		int userAge = 30;
		int serviceCost;
		int tensPlace =(int)(userAge/10);
		
		switch (tensPlace) {
		case 1 ->{ serviceCost = 1000;
				
				System.out.println(tensPlace +"0代の料金は" + serviceCost+"円");
				
		}
		case 2 ->{ serviceCost = 2000;
		
				System.out.println(tensPlace+ "0代の料金は" + serviceCost+"円");
		
		}

		case 3,4 ->{ serviceCost = 3000;
		
				System.out.println(tensPlace + "0代の料金は" + serviceCost+"円");
		
		}
		case 5,6,7 ->{ serviceCost = 4000;
		
				System.out.println(tensPlace + "0代の料金は" + serviceCost+"円");
		
		}
		case 8 ->{ serviceCost = 5000;
		
				System.out.println(tensPlace + "0代の料金は" + serviceCost+"円");
		
		}
		default ->{ serviceCost = 500;
		
				System.out.println(userAge + "歳の料金は" + serviceCost+"円");
		
		}
		
			
		}
		
		
		
		
		
	}

}
