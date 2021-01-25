package com.money.fimsystem.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

//    @Bean
//    public UserDetailsService userDetailsService(){
//        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//        manager.createUser(User.withUsername("root").password("$2a$10$Uyc.BP07DPoF9Fn6HKTjcuJ8yFXmhlgwHQywt/qmiwWG0wSrZFYXK").authorities("root").build());
//        return manager;
//    }


    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
                .and()
                .csrf().disable().authorizeRequests()
                .antMatchers("/**/to_login").permitAll()
                .anyRequest().authenticated()
                .and().
                formLogin()
                .loginPage("/to_login")
                .loginProcessingUrl("/login")
                .successForwardUrl("/hello")
                .and()
                .logout()
                .logoutUrl("/to_login")
                .logoutSuccessUrl("/to_login?logout")
//                .logoutSuccessHandler(logoutSuccessHandler)
//                .addLogoutHandler(logoutHandler)
                .invalidateHttpSession(true);
        ;
    }


}
