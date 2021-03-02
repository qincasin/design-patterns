package filter;

/**
 * Created by qincasin on 2021/3/1.
 * 洗头filter
 */
public class WashHairFilter implements StudyPrepareFilter{
    @Override
    public void doFilter(PreparationList preparationList, FilterChain filterChain) {
        if(preparationList.isWashHair()){
            System.out.println("洗头");
        }
        filterChain.doFilter(preparationList,filterChain);
    }
}
