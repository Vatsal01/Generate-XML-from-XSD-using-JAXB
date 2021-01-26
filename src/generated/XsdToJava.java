package generated;

import java.io.File;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import javax.xml.namespace.QName;


import generated.Menu.Food;

public class XsdToJava {

	private static final ObjectFactory objectFactory = new ObjectFactory();

	public static void main(String[] args) throws JAXBException {
		// TODO Auto-generated method stub
		Menu menuType = objectFactory.createMenu();
		Food foodType = objectFactory.createMenuFood();
		String food[]= {"PIzza","Burger","Dumplings","Pasta","Chicken Curry","Pork - European Side Bacon","Chocolate - Liqueur Cups With Foil","Leeks - Baby, White","Table Cloth 90x90 Colour","Lotus Rootlets - Canned","Versatainer Nc - 8288","Wine - Stoneliegh Sauvignon","Vinegar - Red Wine","Tea - Vanilla Chai","Pepper - Red Thai","Cheese - Swiss","Paper Towel Touchless","Tabasco Sauce, 2 Oz","Wine - Cave Springs Dry Riesling",
				"Apple Pie","Cream Of Tartar","Chocolate - Milk Coating","Cloves - Whole","Island Oasis - Magarita Mix","Veal - Heart","Compound - Raspberry","Bar - Granola Trail Mix Fruit Nut","Gatorade - Cool Blue Raspberry",
				"Beans - Fine","Asparagus - Green, Fresh","Sugar - Splenda Sweetener","Nut - Hazelnut, Whole","Fennel","Carbonated Water - Cherry","Sauce - Black Current, Dry Mix","Milk Powder","Gin - Gilbeys London, Dry",
				"Mayonnaise - Individual Pkg","Extract - Vanilla,artificial","Chocolate - Liqueur Cups With Foil","Wine - Tribal Sauvignon","Mousse - Banana Chocolate","Sauce Tomato Pouch","Cheese - Roquefort Pappillon","Potatoes - Purple, Organic","Bread - Rolls, Corn","Pepper - Sorrano","Zucchini - Yellow","Soy Protein","Pasta - Fettuccine, Dry","Chocolate - Sugar Free Semi Choc","Milk - Buttermilk","Squash - Butternut",
				"Sauce - Balsamic Viniagrette","Croissants Thaw And Serve","India","Zulu","November","Charlie","Quebec","Uniform","Hotel","Bravo","Quebec",
				"Alfa","Tango","Victor","Delta","November","India","Zulu","Romeo","Delta","Yankee","Sierra","Tango","Purplestem Taro","Climbing Arrowheads","Indian Walnut","Sclerophora Lichen","Bristlecone Cryptantha","Squirreltail","Dracontium","Prostrate Milkvetch",
				"Himalayan Berry","Crabseye Lichen","Fewflower Jacob's-ladder","Bluish Spikemoss","Dwarf-cudweed","Columnea","Smooth Tidytips","Western Tansymustard",
				"Manystem Centaury","Sierra Pea","Chick Pea","Fragrant Fritillary","Arctic Groundsel","Leatherleaf Cyanea","Riverbar","Common Frogbit","Droophead Tufted Airplant","Bosc's Mille Graines","Soft Bird's-beak",
				"Littleleaf Wrightwort","Xanthoparmelia Lichen","Prairie Bluebells" } ;		
		
		Random rand = new Random() ;
		float a;
		int b,c;
		List<String> list = new ArrayList<>();
		list.add("Main Course");
		list.add("Drinks");
		list.add("Breads");
		
		
		for( int i=0; i<105; i++ )
		{
			
			b = rand.nextInt(1500);
			c = rand.nextInt(3);
			a = rand.nextInt(70);
			foodType.setPrice(a);
			
			foodType.setCalories(b);
			foodType.setCategory(list.get(c));
			foodType.setDescription(list.get(c));
			foodType.setName(food[i]);
			
			menuType.getFood().add(i, foodType);		
		}
		
		
		JAXBContext jaxbContext = JAXBContext.newInstance("generated") ;
		
	Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE) ;
		
		JAXBElement<Menu> jaxbElement = new JAXBElement<Menu>(new QName("Menu"), Menu.class, menuType);
	
		StringWriter sw = new StringWriter() ;
		
        jaxbMarshaller.marshal(jaxbElement, sw);
        jaxbMarshaller.marshal(jaxbElement, System.out) ;
	}
	

}
