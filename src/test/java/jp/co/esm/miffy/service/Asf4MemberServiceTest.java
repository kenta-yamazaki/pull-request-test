package jp.co.esm.miffy.service;

import jp.co.esm.miffy.MiffyApplication;
import jp.co.esm.miffy.entity.Asf4Member;
import jp.co.esm.miffy.repository.Asf4MemberRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@ContextConfiguration(classes = MiffyApplication.class)
class Asf4MemberServiceTest {

    @Autowired
    Asf4MemberService asf4MemberService;


//    @Test
//    void test() {
//        fail();
//    }

    @Test
    void selectAll() {
        // 準備
        List<Asf4Member> expectedAsf4Members = new ArrayList<>();
        expectedAsf4Members.add(new Asf4Member(1, "ドナルド", "asf", false));
        expectedAsf4Members.add(new Asf4Member(2, "デイジー", "esm", false));

        // 実行
        List<Asf4Member> actualAsf4Members = asf4MemberService.selectAll();

        // 検証
         assertEquals(expectedAsf4Members, actualAsf4Members);
    }

}
