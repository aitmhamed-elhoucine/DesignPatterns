package com.sfeir.strucutre.proxyPattern;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReportGeneratorImplProxyTest {

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void displayReportTemplate() {
        Role accessRole=new Role();
        accessRole.setRole("Manager");
        ReportGenerator proxy=new ReportGeneratorImplProxy(accessRole);
        proxy.displayReportTemplate("Pdf",150);
    }

    @Test
    void generateComplexReport() {
        Role accessRole=new Role();
        accessRole.setRole("Manager");
        ReportGenerator proxy=new ReportGeneratorImplProxy(accessRole);
        proxy.generateComplexReport("Pdf",150);
    }

    @Test
    void generateSensitiveReport() {
        Role accessRole = new Role();
        accessRole.setRole("Manager");
        ReportGenerator proxy=new ReportGeneratorImplProxy(accessRole);
        proxy.generateSensitiveReport();
    }

    @Test
    void generateSensitiveReport_unauthorized() {
        Role accessRole=new Role();
        accessRole.setRole("USER");
        ReportGenerator proxy=new ReportGeneratorImplProxy(accessRole);
        proxy.generateSensitiveReport();
    }
}