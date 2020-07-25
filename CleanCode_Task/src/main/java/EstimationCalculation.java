
public class EstimationCalculation {
	public static double estimator(String material_standard,double area_of_house,Boolean automated_type)
    {  
        double price_estimate=0;
            if(material_standard=="standard")
            {
               price_estimate= area_of_house*1200;
            }else if(material_standard=="abovestandard")
            {
                price_estimate=area_of_house*1500;
            }else if(material_standard=="highstandard" )
            {    if(automated_type)
                price_estimate=area_of_house*2500;
                else
                price_estimate=area_of_house*1800;
            }
            return price_estimate;
    }
}
