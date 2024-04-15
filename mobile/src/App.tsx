import React from 'react';
import 'react-native-gesture-handler';
import { NavigationContainer } from '@react-navigation/native';
import { createBottomTabNavigator } from '@react-navigation/bottom-tabs';
import { Colors } from 'react-native/Libraries/NewAppScreen';
import { StatusBar, StyleSheet, useColorScheme, View } from 'react-native';
import { menuOptions } from './screens';

const App: React.FC = () => {
  const Tab = createBottomTabNavigator();

  const isDarkMode = useColorScheme() === 'dark';

  const backgroundStyle = {
    backgroundColor: isDarkMode ? Colors.darker : Colors.lighter,
  };

  return (
    <View style={styles.container}>
      <StatusBar
        barStyle={isDarkMode ? 'light-content' : 'dark-content'}
        backgroundColor={backgroundStyle.backgroundColor}
      />

      <NavigationContainer>
        <Tab.Navigator
          screenOptions={{
            tabBarLabelStyle: { fontSize: 18 },
            tabBarActiveTintColor: 'purple',
            tabBarBadge: 1,
            tabBarStyle: styles.tabBarStyle,
          }}>
          {menuOptions.map(menuItem => (
            <Tab.Screen
              name={menuItem.name}
              component={menuItem.component}
              key={menuItem.name}
              options={{
                tabBarIcon: () => menuItem.icon,
                tabBarLabel: menuItem.label,
                // color: menuItem.color
              }}
            />
          ))}
        </Tab.Navigator>
      </NavigationContainer>
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    width: '100%',
    height: '100%',
  },
  tabBarStyle: {
    height: 70,
    width: '95%',
    borderTopLeftRadius: 50,
    borderTopRightRadius: 50,
    borderBottomLeftRadius: 50,
    borderBottomRightRadius: 50,
    shadowColor: '#000',
    elevation: 30,
    marginBottom: 10,
    marginLeft: 10,
  },
});

export default App;
