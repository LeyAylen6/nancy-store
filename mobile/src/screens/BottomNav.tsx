import React, { useState } from 'react';
import { View, TouchableOpacity, Text, StyleSheet } from 'react-native';
import { Home, Truck, User }  from 'react-native-feather';
import { createBottomTabNavigator } from '@react-navigation/bottom-tabs';
import Profile from './Profile';

const BottomNav = ({ navigation }: any) => {
  const Tab = createBottomTabNavigator();

  const [selectedTab, setSelectedTab] = useState('Home');

  const handleNav = (menuSelected: string) => {
    setSelectedTab(menuSelected) 
    navigation.navigate(menuSelected)
  }

  return (
    <View style={styles.container}>
      <Tab.Navigator>
        <Tab.Screen name="Home" component={Home}/>
        <Tab.Screen name="Profile" component={Profile}/>
      </Tab.Navigator>
       {/* <TouchableOpacity
          style={styles.tab}
          onPress={() => handleNav('Home')}
        >
          <Home width={32} height={32} color={selectedTab === 'Home' ? 'purple' : 'black'} />
          <Text style={{ color: selectedTab === 'Home' ? 'purple' : 'black' }}>Home</Text>
        </TouchableOpacity>

        <TouchableOpacity
          style={styles.tab}
          onPress={() => handleNav('Sales')}
        >
          <Truck width={32} height={32} color={selectedTab === 'Sales' ? 'purple' : 'black'} />
          <Text style={{ color: selectedTab === 'Sales' ? 'purple' : 'black' }}>Ventas</Text>
        </TouchableOpacity>

        <TouchableOpacity
          style={styles.tab}
          onPress={() => handleNav('Profile')}
        >
          <User width={32} height={32} color={selectedTab === 'Profile' ? 'purple' : 'black'}/>
          <Text style={{ color: selectedTab === 'Profile' ? 'purple' : 'black' }}>Profile</Text>
        </TouchableOpacity> */}
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flexDirection: 'row',
    justifyContent: 'space-around',
    alignItems: 'center',
    backgroundColor: '#f0f0f0',
    paddingVertical: 10,
    paddingHorizontal: 20,
    borderTopWidth: 1,
    borderTopColor: '#ccc',
  },
  tab: {
    alignItems: 'center',
  },
});

export default BottomNav;