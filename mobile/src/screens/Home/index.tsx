import { createStackNavigator } from "@react-navigation/stack";
import Detail from "./Detail";
import Home from "./Home";

const HomeTabStack = () => {
  const Stack = createStackNavigator();

  return (
    <Stack.Navigator>
      <Stack.Screen name="Home" component={Home} />
      <Stack.Screen name="Detail" component={Detail} />
    </Stack.Navigator>
  );
};

export default HomeTabStack;