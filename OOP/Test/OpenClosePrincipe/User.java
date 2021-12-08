import java.util.List;
import java.util.stream.Collectors;

public class User extends BaseUser {
    private List<Beer> wishList;

    @Override
    public String getDisplayName() {
        return String.format("%s,With list: %s",
                this.getUsername(),
                this.getWishList().stream().map(Beer::getBeerName).collect(Collectors.joining(",")));
    }

    public List<Beer> getWishList() {
        return wishList;
    }

    public void setWishList(List<Beer> wishList) {
        this.wishList = wishList;
    }
}
