package bookstore.order;

import bookstore.BookstoreApplication;
import bookstore.join.CustomerVO;

import java.util.List;

public class OrderController {
    private static OrderController instance = new OrderController();
    public static OrderController getInstance() {
        return instance;
    }
    private OrderController() {}

    private OrderService service = OrderService.getInstance();

    private CustomerVO session = BookstoreApplication.getSession();

    public List<OrderVO> findAll() {
        return service.findAll(session.getCustId());
    }

}
