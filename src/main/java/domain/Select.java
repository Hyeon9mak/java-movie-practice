package domain;

public class Select {

    private final int id;

    private Select(String id) {
        int integerId = validateInteger(id);
        this.id = integerId;
    }

    public static Select newSelectWithId(String id) {
        return new Select(id);
    }

    private int validateInteger(String id) {
        try {
            return Integer.parseInt(id);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("입력한 id가 올바르지 않습니다.");
        }
    }

    public int getId() {
        return id;
    }
}
