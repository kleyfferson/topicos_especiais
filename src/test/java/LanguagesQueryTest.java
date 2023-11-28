import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;
import queries.Language;

public class LanguagesQueryTest extends BaseTest{

    @Test
    public void shouldReturnStatus200() {

        Response response = Language.getLanguageQuery(requestSpec);

        response.then().
                assertThat().
                statusCode(200);
    }
    @Test
    public void shouldReturnCodeaf() {

        Response response = Language.getLanguageQuery(requestSpec);

        response.then().
                assertThat().
                body("data.language.code", is("af"));
    }
    @Test
    public void shouldReturnNameAfrikaans() {

        Response response = Languages.getLanguageQuery(requestSpec);

        response.then().
                assertThat().
                body("data.language.name", is ("Afrikaans"));
    }
}