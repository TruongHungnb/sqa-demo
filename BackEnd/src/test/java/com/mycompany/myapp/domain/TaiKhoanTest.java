package com.mycompany.myapp.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

import com.mycompany.myapp.web.rest.TestUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TaiKhoanTest {

    private static final String USER_NAME = "USER_NAME";
    private static final String PASS_WORD = "PASS_WORD";
    @Mock
    private HoGiaDinh hoGiaDinh;
    @InjectMocks
    private TaiKhoan underTest;

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(TaiKhoan.class);
        TaiKhoan taiKhoan1 = new TaiKhoan();
        taiKhoan1.setId(1L);
        TaiKhoan taiKhoan2 = new TaiKhoan();
        taiKhoan2.setId(taiKhoan1.getId());
        assertThat(taiKhoan1).isEqualTo(taiKhoan2);
        taiKhoan2.setId(2L);
        assertThat(taiKhoan1).isNotEqualTo(taiKhoan2);
        taiKhoan1.setId(null);
        assertThat(taiKhoan1).isNotEqualTo(taiKhoan2);
    }

    @Test
    void getId() {
    }

    @Test
    void id() {
    }

    @Test
    void getUserName() {
    }

    @Test
    void userName() {
    }

    @Test
    void getPassWord() {
    }

    @Test
    void getHoGiaDinh() {
    }

    @Test
    void hoGiaDinh() {
    }

    @Nested
    class WhenGettingId {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenIding {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenGettingUserName {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenUseringName {
        private final String USER_NAME = "USER_NAME";

        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenGettingPassWord {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenPassingWord {
        private final String PASS_WORD = "PASS_WORD";

        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenGettingHoGiaDinh {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenHoingGiaDinh {
        @Mock
        private HoGiaDinh hoGiaDinh;

        @BeforeEach
        void setup() {
        }
    }
}
