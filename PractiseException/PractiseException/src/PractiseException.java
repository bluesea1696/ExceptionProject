import java.util.HashMap;


public class PractiseException {
	public static HashMap <String, Double> product = new HashMap<>(); 
	public static void main(String[] args) {
		product.put("A1", 10.0);
		product.put("A2", 5.2);
		product.put("A3", 3.7);
		product.put("A4", 8.9);
		product.put("A5", 4.6);
		
		getProduct("A3");
		getProduct("A10");
	}

	private static void getProduct(String id) {
		try {
			validate(id);
			System.out.println("ID: " +id + " - Price: " +product.get(id));
		} catch (NoSuchProductException e) {
			e.printStackTrace();
		}
		
	}
	
	private static boolean test(String id){
		for(String ID : product.keySet()){
			if(id.equals(ID)){
				return true;
			}
		}
		return false;
	}

	private static void validate(String id) throws NoSuchProductException {
		if(!test(id))
			throw new NoSuchProductException("Không tồn tại sản phẩm có ID: " +id);
	}
}
