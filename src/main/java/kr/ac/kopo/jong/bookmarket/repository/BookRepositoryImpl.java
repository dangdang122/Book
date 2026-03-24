package kr.ac.kopo.jong.bookmarket.repository;

import kr.ac.kopo.jong.bookmarket.domain.Book;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
@Repository
public class BookRepositoryImpl implements BookRepository {
    private List<Book> listOfBooks = new ArrayList<Book>();

    public BookRepositoryImpl(){
        Book book1 = new Book();
        book1.setBookId("isbn1001");
        book1.setName("스프링 부트 완전정복");
        book1.setDescription("스프링 부트는 스프링을 기반으로 쉽고 빠르게 웹 애플리케이션을 개발할 수 있는 도구이다. 이 책에서는 스프링 부트의 기본 개념을 쉽게 이해하고 다양한 실습 예제로 빠르게 익힐 수 있다. 그리고 단계별 실습을 따라 하다 보면 도서 쇼핑몰 구축 프로젝트를 완성할 수 있다. 개념-실습-프로젝트의 3단계 학습으로 스프링 부트를 제대로 익힌다면 개발 시간을 단축하고 생산성을 높일 수 있는 개발자로 성장할 수 있다.");
        book1.setPublisher("길벗캠퍼스");
        book1.setCategory("IT전문서");
        book1.setUnitPrice(new BigDecimal(35000));
        book1.setReleaseDate("2024/12/31");

        Book book2 = new Book();
        book2.setBookId("isbn1002");
        book2.setName("차라투스트라는 이렇게 말했다");
        book2.setDescription("서양 철학사상 가장 독창적인 철학자의 가장 위대한 서사시\n" +
                "니체의 핵심 철학이 장쾌하고 시적인 언어로 집약된 대표작\n" +
                "\n" +
                "“그대들에게 말하거니와, 춤추는 별을 낳으려면\n" +
                "인간은 자신 속에 혼돈을 간직하고 있어야 한다.”\n" +
                "\n" +
                "모든 이를 위한, 그러나 그 누구의 것도 아닌 책\n" +
                "\n" +
                "니체의 『차라투스트라는 이렇게 말했다』가 민음사에서 출간되었다. “또?”라고 묻는 사람이 있다면, “얼마든지.”라고 답할 수밖에 없다. “왜?”라고 묻는다면, “그래야만 한다.”라고 대답할 테고, “그럴 만한가?”라는 물음에도 역시 “얼마든지.”라고 할 것이다. 이 책은 낡은 고전을 단순히 재생산해 낸 것이 아니다. 그렇다고 새로운 논쟁거리를 내세워 주목을 받으려는 전략이나 오래전부터 두꺼운 해석의 외투에 겹겹이 둘러싸인 작품의 아우라를 변질시키려는 그 어떤 의도도 없다. 다만 니체의 『차라투스트라는 이렇게 말했다』를 가장 원문에 가깝게, 충실하게 번역해 냄으로써, 니체에 관한 현란한 해석들로 어지럼증에 휩싸인 독자들에게 하나의 정본(正本)을 마련해 주고자 했을 뿐이다. ");
        book2.setPublisher("프리드리히 니체");
        book2.setCategory("소설/시/희곡");
        book2.setUnitPrice(new BigDecimal(14400));
        book2.setReleaseDate("2004/01/02");

        listOfBooks.add(book1);
        listOfBooks.add(book2);

    }
    @Override
    public List<Book> getAllBookList(){
        return List.of();
    }
}
