package service;

import domain.Select;
import domain.SelectRepository;
import view.InputView;

public class SelectService {

    private static final String COMMA = ",";

    public static void selectMovies() {
        String selectIds = InputView.inputMovieId();
        String[] selectId = splitWithValidate(selectIds);
        for (String select : selectId) {
            SelectRepository.addSelect(Select.newSelectWithId(select));
        }
    }

    private static String[] splitWithValidate(String selectIds) {
        String[] selectId = selectIds.split(COMMA);
        if (selectId.length < 1) {
            throw new IllegalArgumentException("예약할 영화를 선택하라고!");
        }
        return selectId;
    }

}
