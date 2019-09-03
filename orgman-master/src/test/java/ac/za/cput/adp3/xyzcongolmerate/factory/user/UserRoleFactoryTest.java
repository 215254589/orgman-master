package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRoleFactoryTest {

    @Test
    public void buildUserRole()
    {
        UserRole userRole = UserRoleFactory.buildUserRole("chadb.businessbootstrapper@gmail.com","Chad","Boswell","manager");
        assertNotNull(userRole);
        System.out.println(userRole);
    }
}