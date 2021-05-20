package com.mycompany.myapp.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

import com.mycompany.myapp.web.rest.TestUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.annotation.Rollback;

@ExtendWith(MockitoExtension.class)
class BacTienHoNgheoTest {

    private static final String TEN_BAC = "TEN_BAC";
    @InjectMocks
    private BacTienHoNgheo underTest;

    @Test
    @Rollback

    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(BacTienHoNgheo.class);
        BacTienHoNgheo bacTienHoNgheo1 = new BacTienHoNgheo();
        bacTienHoNgheo1.setId(1L);
        BacTienHoNgheo bacTienHoNgheo2 = new BacTienHoNgheo();
        bacTienHoNgheo2.setId(bacTienHoNgheo1.getId());
        assertThat(bacTienHoNgheo1).isEqualTo(bacTienHoNgheo2);
        bacTienHoNgheo2.setId(2L);
        assertThat(bacTienHoNgheo1).isNotEqualTo(bacTienHoNgheo2);
        bacTienHoNgheo1.setId(null);
        assertThat(bacTienHoNgheo1).isNotEqualTo(bacTienHoNgheo2);

    }

    @Test
    @Rollback
    void getId() {
    }

    @Test
    @Rollback
    void setId() {
    }

    @Test
    @Rollback
    void id() {
    }

    @Test
    @Rollback
    void getTenBac() {
    }

    @Test
    @Rollback
    void tenBac() {
    }

    @Test
    @Rollback
    void setTenBac() {
    }

    @Test
    @Rollback
    void getGiaTriBac() {
    }

    @Test
    @Rollback
    void giaTriBac() {
    }

    @Test
    @Rollback
    void setGiaTriBac() {
    }

    @Test
    @Rollback
    void testEquals() {
    }

    @Test
    @Rollback
    void testHashCode() {
    }

    @Test
    @Rollback
    void testToString() {
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
    class WhenGettingTenBac {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenTeningBac {
        private final String TEN_BAC = "TEN_BAC";

        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenGettingGiaTriBac {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenGiaingTriBac {
        @BeforeEach
        void setup() {
        }
    }
}
