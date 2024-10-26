package InterFace;

/**
 * @author 王丽杰
 * @date 2024/10/26
 * @className UserService
 * @package InterFace
 * @description 接口实例
 */
public interface UserService {
    //接口中的所有定义都是抽象的，默认public abstract
    void run();
    void run(String name);

    //增删改查
    void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);

}
