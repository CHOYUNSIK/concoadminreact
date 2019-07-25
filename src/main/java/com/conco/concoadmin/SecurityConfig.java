package com.conco.concoadmin;

import java.security.AuthProvider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@ComponentScan("org.baeldung.security")
public class SecurityConfig extends WebSecurityConfigurerAdapter {

//	@Autowired
//	DataSource dataSource;
//	
//    @Autowired
//    private LoginSuccessHandler loginSuccessHandler;
//
//    @Autowired
//    private UserDetailService userDetailService;

	
//	  @Autowired 
//	  ConcoadminApplication authProviders;

	/*
	 * @Autowired ConcoAuthenticationProvider concoAuthenticationProvider;
	 */


	

//	
//	@Autowired
//	private ConcoAuthenticationProvider authProvider;
//	
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.authenticationProvider(authProvider);
//    }

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/css/**", "/images/**", "/js/**", "/scss/**", "/vendor/**", "/favicon.ico");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
			
//	      http.authorizeRequests().anyRequest().authenticated()
//          .and()
//          .httpBasic();
		
		http
		.csrf().disable()
		.authorizeRequests()
				.antMatchers("/ADM").permitAll()
				//.antMatchers("/ADM/loginProcess").permitAll()
				//.antMatchers("/ADM/loginSuccess").permitAll()
				.anyRequest().authenticated()
				.and()
		.formLogin()
				.loginPage("/ADM")
				.loginProcessingUrl("/ADM/loginProcess")
				.usernameParameter("id")
				.passwordParameter("pw")
				.defaultSuccessUrl("/ADM/loginSuccess")
				.failureUrl("/ADM/loginPageFail")
				.permitAll() 
				.and()
		.logout()
				.logoutUrl("/ADM/logout")
				.logoutSuccessUrl("/")
				.invalidateHttpSession(true)
				.permitAll();


		/* http.authenticationProvider(concoAuthenticationProvider); */
	  
//		http.authorizeRequests().anyRequest().authenticated().and().formLogin().loginPage("/")
//				.loginProcessingUrl("/").failureUrl("/?error=true").successHandler(loginSuccessHandler)
//				.usernameParameter("username").passwordParameter("password").permitAll().and().logout()
//				.deleteCookies("remove").invalidateHttpSession(true)
//				.logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/").and().csrf()
//				.disable();

// 		http.authorizeRequests()
// 		.antMatchers("/admin/**")
// 		.hasRole("ADMIN")
// 		.antMatchers("/**")
// 		.permitAll();
		

	}


	
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }l
//    
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth.authenticationProvider(authenticationProvider());
//    }
//    
//    @Bean
//    public DaoAuthenticationProvider authenticationProvider() {
//        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
//        authenticationProvider.setUserDetailsService(userDetailService);
//       // authenticationProvider.setPasswordEncoder(passwordEncoder()); //패스워드를 암호활 경우 사용한다
//        return authenticationProvider;
//    }

//    @Bean
//    @Override
//    public UserDetailsService userDetailsService() {
//        UserDetails user =
//             User.with
//                .username("a")
//                .password("a")
//                .roles("a")
//                .build();
//
//        return new InMemoryUserDetailsManager(user);
//    }
}
