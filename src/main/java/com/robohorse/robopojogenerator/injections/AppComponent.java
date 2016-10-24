package com.robohorse.robopojogenerator.injections;

import com.robohorse.robopojogenerator.actions.GeneratePOJOAction;
import com.robohorse.robopojogenerator.generator.postprocessors.AutoValueClassPostProcessor;
import com.robohorse.robopojogenerator.generator.postprocessors.CommonJavaPostProcessor;
import com.robohorse.robopojogenerator.generator.postprocessors.KotlinDataClassPostProcessor;
import com.robohorse.robopojogenerator.listeners.GenerateActionListener;
import dagger.Component;

import javax.inject.Singleton;

/**
 * Created by vadim on 28.09.16.
 */
@Singleton
@Component(modules = {
        AppModule.class
})
public interface AppComponent {

    void inject(GeneratePOJOAction item);

    void inject(GenerateActionListener item);

    CommonJavaPostProcessor newClassPostProcessor();

    AutoValueClassPostProcessor newAutoValueClassPostProcessor();

    KotlinDataClassPostProcessor newKotlinDataClassPostProcessor();
}
