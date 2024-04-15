import { BottomTabNavigationProp } from "@react-navigation/bottom-tabs";
import { Text } from "react-native";

export type RootTabParamList = {
    Profile: undefined;
};

type ProfileTabNavigationProp = BottomTabNavigationProp<RootTabParamList, 'Profile'>;

interface ProfileProps {
    navigation: ProfileTabNavigationProp
}

// ----

const Profile: React.FC<ProfileProps> = ({ navigation }) => {
    return (<Text>HOLA</Text>)
}

export default Profile;