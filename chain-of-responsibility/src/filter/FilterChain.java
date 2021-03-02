package filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qincasin on 2021/3/1.
 */
public class FilterChain implements StudyPrepareFilter{
    private int pos = 0;
    private Study study;

    private List<StudyPrepareFilter> filterList;

    public FilterChain(Study study) {
        this.study = study;
    }

    public void addFilter(StudyPrepareFilter filter) {
        if(filterList==null){
            filterList = new ArrayList();
        }
        filterList.add(filter);
    }

    @Override
    public void doFilter(PreparationList preparationList, FilterChain filterChain) {
        //所有过滤器
        if(pos == filterList.size()){
            study.study();
            return;
        }
        filterList.get(pos++).doFilter(preparationList,filterChain);
    }
}
