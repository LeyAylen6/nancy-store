import { BottomTabNavigationProp } from "@react-navigation/bottom-tabs";

type RootTabParamList = {
    Sales: undefined;
};

type SalesTabNavigationProp = BottomTabNavigationProp<RootTabParamList, 'Sales'>;

export interface SalesProps {
    navigation: SalesTabNavigationProp
}