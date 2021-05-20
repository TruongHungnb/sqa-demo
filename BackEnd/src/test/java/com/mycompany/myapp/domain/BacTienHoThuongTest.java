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
class BacTienHoThuongTest {

    private static final String TEN_BAC = "TEN_BAC";
    @InjectMocks
    private BacTienHoThuong underTest;

    @Test

    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(BacTienHoThuong.class);
        BacTienHoThuong bacTienHoThuong1 = new BacTienHoThuong();
        bacTienHoThuong1.setId(1L);
        BacTienHoThuong bacTienHoThuong2 = new BacTienHoThuong();
        bacTienHoThuong2.setId(bacTienHoThuong1.getId());
        assertThat(bacTienHoThuong1).isEqualTo(bacTienHoThuong2);
        bacTienHoThuong2.setId(2L);
        assertThat(bacTienHoThuong1).isNotEqualTo(bacTienHoThuong2);
        bacTienHoThuong1.setId(null);
        assertThat(bacTienHoThuong1).isNotEqualTo(bacTienHoThuong2);
    }

    @Test

    void getId() {
    }

    @Test

    void setId() {
    }

    @Test

    void id() {
    }

    @Test

    void getTenBac() {
    }

    @Test

    void tenBac() {
    }

    @Test

    void setTenBac() {
    }

    @Test

    void getGiaTriBac() {
    }

    @Test

    void giaTriBac() {
    }

    @Test

    void setGiaTriBac() {
    }

    @Test
    void testEquals() {
    }

    @Test
    void testHashCode() {
    }

    @Test
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
