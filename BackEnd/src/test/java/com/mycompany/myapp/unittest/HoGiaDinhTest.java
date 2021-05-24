//package com.mycompany.myapp.unittest;
//
//import static org.hamcrest.CoreMatchers.containsString;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.transaction.Transactional;
//
//import org.aspectj.lang.annotation.Before;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.security.test.context.support.WithMockUser;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MockMvcBuilder;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.ResultActions;
//import org.springframework.test.web.servlet.ResultMatcher;
//
//import com.mycompany.myapp.domain.HoGiaDinh;
//import com.mycompany.myapp.repository.HoGiaDinhRepository;
//import com.mycompany.myapp.repository.HoaDonRepository;
//import com.mycompany.myapp.service.HoGiaDinhService;
//import com.mycompany.myapp.web.rest.HoGiaDinhResource;
//import com.mycompany.myapp.web.rest.HoaDonResource;
//import com.mycompany.myapp.web.rest.TestUtil;
//
//@SpringBootTest
//@Transactional
//@AutoConfigureMockMvc
//@WithMockUser
//
//public class HoGiaDinhTest {
//	private MockMvc mockMvc;
//
//    @Mock
//    private HoGiaDinhService hoGiaDinhService;
//
//    @InjectMocks
//    private HoGiaDinhResource hoGiaDinhResource;
//
//    @Before(value = "")
//    public void setUp() throws Exception {
//    			mockMvc = MockMvcBuilders.standaloneSetup(hoGiaDinhResource)
//    					.build();
//    }
//    @Test
//    public void testHelloWorld() throws Exception {
//    	int page = 2;
//
//        when(hoGiaDinhService.findAll(
//        		.param))
//        .thenReturn("hello");
//
//        mockMvc.perform(get("/hello"))
//                .andExpect(status().isOk())
//                .andExpect(content().string("hello"));
//
//        verify(helloService).hello();
//    }
////    }
////	private static final String ENTITY_API_URL = "/api/ho-gia-dinhs";
////
////	private static final int ArrayList = 0;
////	
////	@Test void getAllHoGiaDinhs() throws Exception{
////		
////		mockMvc.perform(get("/"))
////		.andDo(print()).andExpect(status().isOk())
////		.andExpect((ResultMatcher) content().string(containsString("heelo")));
////	    }
////	
////	@Test
////	 void createHoGiaDinh() throws Exception {
////		String tenChuHo = "Dan";
////		String maHo = "BN001";
////		String soCanCuoc = "12345656";
////		String loaiHo = "AAAAAAAA";
////		String soHoNgheo = "12344546";
////		String email = "tongthidan99@gmail.com";
////		String diachi = "Hoang Mai";
////		String sdt = "0978644";
////		
////		hoGiaDinh = new HoGiaDinh(tenChuHo,maHo,loaiHo,soCanCuoc,soHoNgheo,email,diachi,sdt);
////		hoGiaDinh.setTenChuHo( tenChuHo);
////		hoGiaDinh.setMaHo(maHo);
////		hoGiaDinh.setLoaiHo(loaiHo);
////		hoGiaDinh.setSoCanCuoc(soCanCuoc);
////		hoGiaDinh.setSoHoNgheo(soHoNgheo);
////		hoGiaDinh.setEmail(email);
////		hoGiaDinh.setSdt(diachi);
////		hoGiaDinh.setDiaChi(diachi);
////		hoGiaDinh.setSdt(sdt);
////		h
////		HoGiaDinh result = hoGiaDinhRepository.save(hoGiaDinh);
////		hoGiaDinhRepository.save(hoGiaDinh);
////		MvcResult result1 =  restHoGiaDinhMockMvc
////		.perform(((ResultActions) post(ENTITY_API_URL,hoGiaDinh)
////				.contentType(MediaType.APPLICATION_JSON))
////				
////		
////		.andExpect(status().isCreated())
////		.andReturn();
//		
//	}
//	
//	
//	
//		
//
//}
