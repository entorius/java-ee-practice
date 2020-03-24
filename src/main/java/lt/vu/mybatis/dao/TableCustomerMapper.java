package lt.vu.mybatis.dao;

import java.util.List;

import lt.vu.mybatis.model.Customer;
import lt.vu.mybatis.model.TableCustomer;
import lt.vu.mybatis.model.TableEntity;
import org.mybatis.cdi.Mapper;

@Mapper
public interface TableCustomerMapper {

    int deleteRole(int customerId, int tableEntityId);
    int addRole(int customerId, int tableEntityId);
    List<TableEntity> getTableEntities(int customerId);
    List<Customer> getCustomers(int tableEntityId);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.TABLE_CUSTOMER
     *
     * @mbg.generated Thu Mar 12 11:58:57 EET 2020
     */
    int insert(TableCustomer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.TABLE_CUSTOMER
     *
     * @mbg.generated Thu Mar 12 11:58:57 EET 2020
     */
    List<TableCustomer> selectAll();
}