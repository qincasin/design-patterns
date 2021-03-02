package filter;

/**
 * Created by qincasin on 2021/3/1.
 * 吃饭filter
 */
public class HaveBeakfastFilter implements StudyPrepareFilter{
    @Override
    public void doFilter(PreparationList preparationList, FilterChain filterChain) {
        if(preparationList.isHaveBreakfast()){
            System.out.println("吃饭");
        }
        filterChain.doFilter(preparationList,filterChain);
    }
}
