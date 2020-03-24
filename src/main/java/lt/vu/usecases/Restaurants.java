package lt.vu.usecases;

import lombok.Getter;
import lombok.Setter;
import lt.vu.mybatis.dao.RestaurantMapper;
import lt.vu.mybatis.model.Restaurant;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@Model
public class Restaurants {
    @Inject
    private RestaurantMapper restaurantsDAO;

    @Getter
    @Setter
    private Restaurant restaurantToCreate = new Restaurant();

    @Getter
    private List<Restaurant> allRestaurants;

    @PostConstruct
    public void init(){
        loadAllRestaurants();
    }

    @Transactional
    public String createRestaurant(){
        this.restaurantsDAO.insert(restaurantToCreate);
        return "restaurants?faces-redirect=true";
    }

    private void loadAllRestaurants(){
        this.allRestaurants = restaurantsDAO.selectAll();
    }
}
