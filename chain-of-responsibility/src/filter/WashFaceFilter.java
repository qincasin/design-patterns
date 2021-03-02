package filter;

/**
 * Created by qincasin on 2021/3/1.
 * 洗脸filter
 */
public class WashFaceFilter implements StudyPrepareFilter{
    @Override
    public void doFilter(PreparationList preparationList, FilterChain filterChain) {
        if(preparationList.isWashFace()){
            System.out.println("洗脸");
        }
        filterChain.doFilter(preparationList,filterChain);
    }
}
