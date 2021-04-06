package dbrito.com.br.foody.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dbrito.com.br.foody.data.database.RecipesDatabase
import dbrito.com.br.foody.util.Constants.Companion.DATABASE_NAME
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(context, RecipesDatabase::class.java, DATABASE_NAME).build()

    @Singleton
    @Provides
    fun provideDao(database: RecipesDatabase) = database.recipesDao()
}