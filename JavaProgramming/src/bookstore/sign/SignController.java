package bookstore.sign;

import bookstore.BookstoreApplication;
import bookstore.common.HomeMenu;
import bookstore.join.CustomerVO;

public class SignController {
    private static SignController instance = new SignController();
    public static SignController getInstance() {
        return instance;
    }
    private SignController() {}

    private SignService service = SignService.getInstance();

    private CustomerVO session = BookstoreApplication.getSession();

    public CustomerVO signIn(CustomerVO vo) {
        CustomerVO custom = service.findUser(vo);
        if (custom == null) {
            return null;
        }
        session.setCustId(custom.getCustId());
        session.setName(custom.getName());
        return custom;
    }
    public int signOut() {
        // 세션 초기화
        session.invalidate();
        return HomeMenu.HOME.getMenu();
    }
}