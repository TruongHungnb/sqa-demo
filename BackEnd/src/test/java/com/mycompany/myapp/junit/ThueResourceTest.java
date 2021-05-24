package com.mycompany.myapp.junit;

import com.mycompany.myapp.domain.BacTienHoNgheo;
import com.mycompany.myapp.web.rest.ThueResource;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import javax.transaction.Transactional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
@AutoConfigureMockMvc

class ThueResourceTest {
     @Autowired
     private MockMvc restThueMockMvc;

    @InjectMocks
    private ThueResource thueTest;


    @Test
    @Transactional
    void createThue()  throws  Exception{


    }

    @Test
    void updateThue() {
    }

    @Test
    void partialUpdateThue() {
    }

    @Test
    void getAllThues() {
    }

    @Test
    void getThue() {
    }

    @Test
    void deleteThue() {
    }

    @Test
    void testCreateThue() {
    }

    @Test
    void testUpdateThue() {
    }

    @Test
    void testPartialUpdateThue() {
    }

    @Test
    void testGetAllThues() {
    }

    @Test
    void testGetThue() {
    }

    @Test
    void testDeleteThue() {
    }
}
