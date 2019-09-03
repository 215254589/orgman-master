package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationUserFactoryTest {

    @Test
    public void buildOrganisationUser()
    {
        OrganisationUser organisationUser = OrganisationUserFactory.buildOrganisationUser("CB23741852963","chadb.businessbootstrapper@gmail.com");
        assertNotNull(organisationUser);
        System.out.println("User Organisation details: " + "\n" + organisationUser);


    }
}