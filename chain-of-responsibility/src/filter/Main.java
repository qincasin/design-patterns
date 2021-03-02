package filter;

/**
 * Created by qincasin on 2021/3/1.
 */
public class Main {
    public static void main(String[] args) {
        PreparationList preparationList =new PreparationList();
        preparationList.setHaveBreakfast(true);
        preparationList.setWashHair(true);
        preparationList.setWashFace(true);

        Study study =new Study();

        StudyPrepareFilter filter1 = new WashFaceFilter();
        StudyPrepareFilter filter2 = new WashHairFilter();
        StudyPrepareFilter filter3 = new HaveBeakfastFilter();

        FilterChain chain = new FilterChain(study);
        chain.addFilter(filter1);
        chain.addFilter(filter2);
        chain.addFilter(filter3);

        chain.doFilter(preparationList,chain);




    }
}
