import { BottomTabNavigationProp } from "@react-navigation/bottom-tabs";

type RootTabParamList = {
    Profile: undefined;
};

type ProfileTabNavigationProp = BottomTabNavigationProp<RootTabParamList, 'Profile'>;

export interface ProfileProps {
    navigation: ProfileTabNavigationProp
}