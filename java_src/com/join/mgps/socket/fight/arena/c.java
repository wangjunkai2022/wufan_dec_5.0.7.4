package com.join.mgps.socket.fight.arena;

import android.content.Context;
import android.text.TextUtils;
import app.mgsim.arena.AreaInfo;
import app.mgsim.arena.ArenaConstants;
import app.mgsim.arena.ArenaRequest;
import app.mgsim.arena.ArenaResponse;
import app.mgsim.arena.UserType;
import com.join.mgps.Util.o0;
import com.join.mgps.Util.v0;
import com.join.mgps.activity.LocalGameActivity;
import com.papa.controller.core.ControllerManager;
import com.papa.controller.core.d;
import com.papa91.battle.protocol.BattleArea;
import com.papa91.battle.protocol.GameRoom;
import com.papa91.battle.protocol.Response;
import com.papa91.battle.protocol.RoomPosition;
import com.papa91.battle.protocol.SimpleRoom;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ArenaUtils.java */
/* loaded from: classes5.dex */
public class c {
    public static boolean a(GameRoom gameRoom, com.join.mgps.Util.b bVar) {
        int uid = bVar.getAccountData().getUid();
        if (gameRoom.getP1().getUid() == 0 || gameRoom.getP1().getUid() == uid) {
            if (gameRoom.getP2().getUid() == 0 || gameRoom.getP2().getUid() == uid) {
                if (gameRoom.getP3().getUid() == 0 || gameRoom.getP3().getUid() == uid) {
                    return (gameRoom.getP4().getUid() == 0 || gameRoom.getP4().getUid() == uid) ? false : true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public static AreaInfo b(BattleArea battleArea) {
        AreaInfo areaInfo = new AreaInfo();
        areaInfo.setArea(battleArea.getNumber());
        return areaInfo;
    }

    public static BattleArea c(int i4) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        return BattleArea.ALL;
                    }
                    return BattleArea.GZ;
                }
                return BattleArea.SH;
            }
            return BattleArea.BJ;
        }
        return BattleArea.ALL;
    }

    public static String d(BattleArea battleArea) {
        try {
            return battleArea.getNumber() == BattleArea.BJ.getNumber() ? "北京区" : battleArea.getNumber() == BattleArea.SH.getNumber() ? "上海区" : battleArea.getNumber() == BattleArea.GZ.getNumber() ? "广东区" : LocalGameActivity.f34225s;
        } catch (Exception unused) {
            return LocalGameActivity.f34225s;
        }
    }

    public static String e(String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        try {
            JSONObject jSONObject3 = new JSONObject(o0.a(str, false));
            if ("0".equals(jSONObject3.getString("retCode")) && (jSONObject = jSONObject3.getJSONObject("data")) != null && (jSONObject2 = jSONObject.getJSONObject("fastbattle.5fun.com")) != null) {
                JSONArray jSONArray = jSONObject2.getJSONArray("ips");
                if (jSONArray.length() > 0) {
                    return (String) jSONArray.get(0);
                }
            }
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        return "";
    }

    public static UserType f(GameRoom gameRoom, com.join.mgps.Util.b bVar) {
        int uid = bVar.getAccountData().getUid();
        if (uid == gameRoom.getLeader()) {
            return UserType.OWNER;
        }
        if (uid != gameRoom.getP1().getUid() && uid != gameRoom.getP2().getUid() && uid != gameRoom.getP3().getUid() && uid != gameRoom.getP4().getUid()) {
            return UserType.SPECTATOR;
        }
        return UserType.TENANT;
    }

    public static String g(ArenaResponse arenaResponse) {
        String str;
        int i4 = arenaResponse.errorType;
        if (i4 == 0) {
            str = "未定义协议！";
        } else if (i4 == 1) {
            str = "系统错误！";
        } else if (i4 == 2) {
            str = "参数错误！";
        } else if (i4 == 3) {
            str = "内部错误！";
        } else if (i4 == 7) {
            str = "密码错误!";
        } else if (i4 == 8) {
            str = "房间已经被解散！";
        } else if (i4 == 9) {
            str = "房间已满，无法加入!";
        } else if (i4 == 10) {
            str = "此房间需要密码!";
        } else if (i4 == 11) {
            str = "铜板不足，无法创建房间!";
        } else if (i4 == 12) {
            str = "铜板不足，无法设置挑战金！";
        } else if (i4 == 13) {
            str = "铜板不足，无法加入加入房间！";
        } else if (i4 == 14) {
            str = "该房间已经解散!";
        } else if (i4 == 16) {
            str = "无法加入，你被禁止加入该房间!";
        } else if (i4 == 17) {
            str = "该房间为比赛专用房间,非参赛选手无法加入!";
        } else {
            str = (i4 == 15 || i4 == 1000) ? arenaResponse.errorInfo : "";
        }
        return TextUtils.isEmpty(str) ? "网络异常！" : str;
    }

    public static RoomPosition h(GameRoom gameRoom, int i4) {
        if (gameRoom.getP1().getUid() != 0 && gameRoom.getP1().getUid() == i4) {
            return gameRoom.getP1();
        }
        if (gameRoom.getP2().getUid() != 0 && gameRoom.getP2().getUid() == i4) {
            return gameRoom.getP2();
        }
        if (gameRoom.getP3().getUid() != 0 && gameRoom.getP3().getUid() == i4) {
            return gameRoom.getP3();
        }
        if (gameRoom.getP4().getUid() == 0 || gameRoom.getP4().getUid() != i4) {
            return null;
        }
        return gameRoom.getP4();
    }

    public static int i(BattleArea battleArea, boolean z4) {
        if (battleArea != null) {
            if (battleArea.getNumber() == BattleArea.ALL.getNumber()) {
                return 8;
            }
            if (z4) {
                return 10;
            }
        }
        return 9;
    }

    public static ArenaResponse j(ArenaResponse arenaResponse, Response response) {
        Response.ProtoType type = response.getType();
        if (type == Response.ProtoType.REFRESH_ROOM_LIST_DISSOLVE) {
            arenaResponse.data = response.getSimpleRoomList();
            arenaResponse.responseType = ArenaConstants.ArenaCommand.PUSH_REFRESH_ROOM_LIST_DISSOLVE;
            return arenaResponse;
        } else if (type == Response.ProtoType.REFRESH_ROOM_LIST_UPDATE) {
            arenaResponse.data = response.getSimpleRoomList();
            arenaResponse.responseType = ArenaConstants.ArenaCommand.PUSH_REFRESH_ROOM_LIST_UPDATE;
            return arenaResponse;
        } else if (type == Response.ProtoType.UPDATE_ROOM_BROADCAST) {
            arenaResponse.data = response.getRoom();
            arenaResponse.responseType = ArenaConstants.ArenaCommand.PUSH_UPDATE_ROOM;
            return arenaResponse;
        } else if (type == Response.ProtoType.DISSOLVE_ROOM_BROADCAST) {
            arenaResponse.data = response.getRoom();
            arenaResponse.responseType = ArenaConstants.ArenaCommand.PUSH_DISSOLVE_ROOM;
            return arenaResponse;
        } else if (type == Response.ProtoType.KICK_ROOM_BROADCAST) {
            arenaResponse.data = response.getRoom();
            arenaResponse.responseType = ArenaConstants.ArenaCommand.PUSH_KICK_ROOM_BROADCAST;
            return arenaResponse;
        } else if (type == Response.ProtoType.ROOM_READY_TIMEOUT_KICKOUT) {
            arenaResponse.data = response.getRoom();
            arenaResponse.responseType = ArenaConstants.ArenaCommand.PUSH_ROOM_READY_TIMEOUT_KICKOUT;
            return arenaResponse;
        } else if (type == Response.ProtoType.ROOM_START_TIMEOUT_KICKOUT) {
            arenaResponse.data = response.getRoom();
            arenaResponse.responseType = ArenaConstants.ArenaCommand.PUSH_ROOM_START_TIMEOUT_KICKOUT;
            return arenaResponse;
        } else if (type == Response.ProtoType.START_GAME_ROOM_BROADCAST) {
            arenaResponse.responseType = ArenaConstants.ArenaCommand.PUSH_START_GAME_ROOM_BROADCAST;
            if (response.getStatusCode() == Response.StatusCode.RESULT_SUCCESS) {
                arenaResponse.data = response.getRoom();
                return arenaResponse;
            }
            return k(arenaResponse, response);
        } else if (type == Response.ProtoType.GLOBAL_MESSAGE_BROADCAST) {
            arenaResponse.responseType = ArenaConstants.ArenaCommand.PUSH_GLOBAL_BROADCAST_ALL;
            arenaResponse.data = response.getNotification();
            return arenaResponse;
        } else if (type == Response.ProtoType.BATTLE_SCORE_BOARD) {
            arenaResponse.responseType = ArenaConstants.ArenaCommand.PUSH_SCORE_BOARD;
            arenaResponse.data = response.getBattleScore();
            try {
                GameRoom room = response.getRoom();
                ArenaRequest arenaRequest = new ArenaRequest(arenaResponse.responseType);
                arenaRequest.roomId = room.getRoomId();
                arenaResponse.request = arenaRequest;
                return arenaResponse;
            } catch (Exception e5) {
                e5.printStackTrace();
                return arenaResponse;
            }
        } else {
            return arenaResponse;
        }
    }

    public static ArenaResponse k(ArenaResponse arenaResponse, Response response) {
        Response.StatusCode statusCode = response.getStatusCode();
        if (response.getLogicErrorCode() != null && response.getLogicErrorCode().equals(Response.LogicErrorCode.ERROR_MESSAGE)) {
            arenaResponse.responseCode = 0;
            arenaResponse.errorType = 15;
            arenaResponse.errorInfo = response.getError();
            return arenaResponse;
        } else if (response.getLogicErrorCode() != null && response.getLogicErrorCode().equals(Response.LogicErrorCode.JOIN_GAME_ROOM_ERROR_KICK)) {
            arenaResponse.responseCode = 0;
            arenaResponse.errorType = 16;
            return arenaResponse;
        } else if (response.getLogicErrorCode() != null && response.getLogicErrorCode().equals(Response.LogicErrorCode.JOIN_GAME_ROOM_ERROR_NO_WHITE)) {
            arenaResponse.responseCode = 0;
            arenaResponse.errorType = 17;
            return arenaResponse;
        } else if (response.getLogicErrorCode() != null && response.getLogicErrorCode().equals(Response.LogicErrorCode.ROOM_ERROR_DISSOLVE)) {
            arenaResponse.responseCode = 0;
            arenaResponse.errorType = 14;
            return arenaResponse;
        } else if (response.getLogicErrorCode() != null && response.getLogicErrorCode().equals(Response.LogicErrorCode.JOIN_GAME_ROOM_ERROR_PASSWORD)) {
            arenaResponse.responseCode = 0;
            arenaResponse.errorType = 7;
            return arenaResponse;
        } else if (response.getLogicErrorCode() != null && response.getLogicErrorCode().equals(Response.LogicErrorCode.NOT_FOUND_ROOM)) {
            arenaResponse.responseCode = 0;
            arenaResponse.errorType = 8;
            return arenaResponse;
        } else if (response.getLogicErrorCode() != null && response.getLogicErrorCode().equals(Response.LogicErrorCode.JOIN_GAME_ROOM_ERROR_FULL)) {
            arenaResponse.responseCode = 0;
            arenaResponse.errorType = 9;
            return arenaResponse;
        } else if (response.getLogicErrorCode() != null && response.getLogicErrorCode().equals(Response.LogicErrorCode.JOIN_GAME_ROOM_ERROR_NEED_PASSWORD)) {
            arenaResponse.responseCode = 0;
            arenaResponse.errorType = 10;
            return arenaResponse;
        } else if (response.getLogicErrorCode() != null && response.getLogicErrorCode().equals(Response.LogicErrorCode.CREATE_ROOM_NO_CHALLENGE_COINS)) {
            arenaResponse.responseCode = 0;
            arenaResponse.errorType = 11;
            return arenaResponse;
        } else if (response.getLogicErrorCode() != null && response.getLogicErrorCode().equals(Response.LogicErrorCode.ROOM_ERROR_NO_CHALLENGE_COINS)) {
            arenaResponse.responseCode = 0;
            arenaResponse.errorType = 12;
            return arenaResponse;
        } else if (response.getLogicErrorCode() != null && response.getLogicErrorCode().equals(Response.LogicErrorCode.JOIN_GAME_ROOM_ERROR_NO_CHALLENGE_COINS)) {
            arenaResponse.responseCode = 0;
            arenaResponse.errorType = 13;
            return arenaResponse;
        } else if (!statusCode.equals(Response.StatusCode.SERVICE_FAILURE) && !statusCode.equals(Response.StatusCode.PARAMS_FAILURE) && !statusCode.equals(Response.StatusCode.INTERNAL_FAILURE) && !statusCode.equals(Response.StatusCode.UN_LOGIN_FAILURE)) {
            arenaResponse.responseCode = 0;
            arenaResponse.errorType = 1000;
            arenaResponse.errorInfo = response.getError();
            return arenaResponse;
        } else {
            arenaResponse.responseCode = 0;
            arenaResponse.errorType = s(response.getStatusCode());
            return arenaResponse;
        }
    }

    public static ArenaResponse l(ArenaResponse arenaResponse, Response response) {
        String str = arenaResponse.responseType;
        if (str == ArenaConstants.ArenaCommand.CMD_SUBSCRIBE_GAME_ROOMLIST) {
            if (response.getType() == Response.ProtoType.FULL_PUSH_ROOM_LIST_ING) {
                arenaResponse.data = response.getSimpleRoomList();
                arenaResponse.responseType = ArenaConstants.ArenaCommand.PUSH_FULL_PUSH_ROOM_LIST_ING;
            } else if (response.getType() == Response.ProtoType.FULL_PUSH_ROOM_LIST_FINISH) {
                arenaResponse.data = new Object[]{response.getRoomCounter(), response.getSimpleRoomList()};
                arenaResponse.responseType = ArenaConstants.ArenaCommand.PUSH_FULL_PUSH_ROOM_LIST_FINISH;
            }
        } else if (str == ArenaConstants.ArenaCommand.CMD_GET_KICK_OUT_ROOM_POSITION_INFO) {
            arenaResponse.data = response.getKickInfo();
        } else if (str == ArenaConstants.ArenaCommand.CMD_GET_FRAMEFORWARD_SERVER) {
            arenaResponse.data = response.getFrameForwardServer();
        } else if (str != ArenaConstants.ArenaCommand.CMD_CREATE_GAME_ROOM && str != ArenaConstants.ArenaCommand.CMD_JOIN_ROOM && str != ArenaConstants.ArenaCommand.CMD_KICK_OUT_ROOM_POSITION && str != ArenaConstants.ArenaCommand.CMD_QUICK_JOIN_ROOM && str != ArenaConstants.ArenaCommand.CMD_SEARCH_ROOM_BY_ID && str != ArenaConstants.ArenaCommand.CMD_LOBBY_START_GAME && str != ArenaConstants.ArenaCommand.CMD_SET_ROOM_CLOSE_P1_POSITION && str != ArenaConstants.ArenaCommand.CMD_SET_ROOM_CLOSE_P2_POSITION && str != ArenaConstants.ArenaCommand.CMD_SET_ROOM_CLOSE_P3_POSITION && str != ArenaConstants.ArenaCommand.CMD_SET_ROOM_CLOSE_P4_POSITION && str != ArenaConstants.ArenaCommand.CMD_SHARE_JOIN_ROOM && str != ArenaConstants.ArenaCommand.CMD_PLAYER_READY_GAME && str != ArenaConstants.ArenaCommand.CMD_SET_ROOM_PASSWORD_ATTR && str != ArenaConstants.ArenaCommand.CMD_SET_ROOM_CHALLENGE_COINS_ATTR && str != ArenaConstants.ArenaCommand.CMD_SET_ROOM_SPECTATOR_JOIN_ATTR && str != ArenaConstants.ArenaCommand.CMD_SET_ROOM_PERIPHERAL_JOIN_ATTR && str != ArenaConstants.ArenaCommand.CMD_SET_ROOM_PC_JOIN_ALTR && str != ArenaConstants.ArenaCommand.CMD_SET_ROOM_SERVER_PLAY_MODE && str != ArenaConstants.ArenaCommand.CMD_SPECTATOR_SIT) {
            if (Objects.equals(str, ArenaConstants.ArenaCommand.CMD_SEND_SCORE_BOARD) || Objects.equals(arenaResponse.responseType, ArenaConstants.ArenaCommand.CMD_SEND_ROM_LOADED)) {
                arenaResponse.data = response.getBattleScore();
                try {
                    GameRoom room = response.getRoom();
                    ArenaRequest arenaRequest = new ArenaRequest(arenaResponse.responseType);
                    arenaRequest.roomId = room.getRoomId();
                    arenaResponse.request = arenaRequest;
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        } else {
            if (str == ArenaConstants.ArenaCommand.CMD_JOIN_ROOM || str == ArenaConstants.ArenaCommand.CMD_SHARE_JOIN_ROOM || str == ArenaConstants.ArenaCommand.CMD_QUICK_JOIN_ROOM) {
                arenaResponse.joinSpectatorReason = response.getJoinSpectatorReason();
            }
            arenaResponse.data = response.getRoom();
        }
        return arenaResponse;
    }

    public static boolean m(long j4) {
        return j4 >= 120;
    }

    public static boolean n(GameRoom gameRoom) {
        int i4 = gameRoom.getP1().getUid() != 0 ? 1 : 0;
        if (gameRoom.getP2().getUid() != 0) {
            i4++;
        }
        if (gameRoom.getP3().getUid() != 0) {
            i4++;
        }
        if (gameRoom.getP4().getUid() != 0) {
            i4++;
        }
        return i4 == 1;
    }

    public static boolean o(Context context) {
        List<ControllerManager.c> q4 = d.r(context).q();
        return q4 != null && q4.size() > 0;
    }

    public static String p(RoomPosition roomPosition) {
        StringBuilder sb = new StringBuilder();
        sb.append("  closed-->" + roomPosition.getClosed());
        sb.append("  vip-->" + roomPosition.getVip());
        sb.append("  uid-->" + roomPosition.getUid());
        sb.append("  title getBackgroudColor -->" + roomPosition.getBattleTitleColor());
        sb.append("  title getTitle -->" + roomPosition.getBattleTitle());
        sb.append("  nickname-->" + roomPosition.getNickname());
        sb.append("  avatar-->" + roomPosition.getAvatar());
        sb.append("  copper-->" + roomPosition.getCopper());
        sb.append("  peripheral-->" + roomPosition.getPeripheral());
        sb.append("  pingVal-->" + roomPosition.getPingVal());
        sb.append("  state-->" + roomPosition.getState());
        return sb.toString();
    }

    public static void q(String str, GameRoom gameRoom) {
        if (gameRoom == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gameRoom info: ");
        sb.append(" gameid->" + gameRoom.getGameId());
        sb.append(" roomId->" + gameRoom.getRoomId());
        sb.append(" Elite->" + gameRoom.getElite());
        sb.append(" password->" + gameRoom.getPassword());
        sb.append(" hasJoinPassword->" + gameRoom.getHasJoinPassword());
        sb.append(" allowSpectatorJoin->" + gameRoom.getAllowSpectatorJoin());
        sb.append(" allowPeripheralJoin->" + gameRoom.getAllowPeripheralJoin());
        sb.append(" spectatorNumber->" + gameRoom.getSpectatorNumber());
        sb.append(" challengeCoins->" + gameRoom.getChallengeCoins());
        sb.append(" playerNumber->" + gameRoom.getPlayerNumber());
        sb.append(" seatsNumber->" + gameRoom.getSeatsNumber());
        sb.append(" leader->" + gameRoom.getLeader());
        sb.append(" playerSeconds->" + gameRoom.getPlayerSeconds());
        sb.append(" RoomState->" + gameRoom.getState());
        if (gameRoom.getP1() != null) {
            sb.append(" room position 1 info: ->" + p(gameRoom.getP1()));
            sb.append("-----");
        }
        if (gameRoom.getP2() != null) {
            sb.append(" room position 2 info: ->" + p(gameRoom.getP2()));
            sb.append("-----");
        }
        if (gameRoom.getP3() != null) {
            sb.append(" room position 3 info: ->" + p(gameRoom.getP3()));
            sb.append("-----");
        }
        if (gameRoom.getP4() != null) {
            sb.append(" room position 4 info: ->" + p(gameRoom.getP4()));
        }
        v0.f(str, sb.toString());
    }

    public static void r(String str, SimpleRoom simpleRoom) {
        if (simpleRoom == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("simpleRoom info: ");
        sb.append(" roomId->" + simpleRoom.getRoomId());
        sb.append(" gameId->" + simpleRoom.getGameId());
        sb.append(" nickname->" + simpleRoom.getNickname());
        sb.append(" vip->" + simpleRoom.getVip());
        sb.append(" createAt->" + simpleRoom.getCreateAt());
        sb.append(" seatsNumber->" + simpleRoom.getSeatsNumber());
        sb.append(" sitDownloadNumber->" + simpleRoom.getSitDownloadNumber());
        sb.append(" hasJoinPassword->" + simpleRoom.getHasJoinPassword());
        sb.append(" allowSpectatorJoin->" + simpleRoom.getAllowSpectatorJoin());
        sb.append(" allowPeripheralJoin->" + simpleRoom.getAllowPeripheralJoin());
        sb.append(" challengeCoins->" + simpleRoom.getChallengeCoins());
        sb.append(" state->" + simpleRoom.getState());
        sb.append(" playSeconds->" + simpleRoom.getPlaySeconds());
        sb.append(" Title.getBackgroudColor->" + simpleRoom.getBattleTitleColor());
        sb.append(" getHasPeripheralPlayer->" + simpleRoom.getHasPeripheralPlayer());
        sb.append(" Title.Title->" + simpleRoom.getBattleTitle());
        sb.append(" elite->" + simpleRoom.getElite());
        sb.append(" copper->" + simpleRoom.getCopper());
        v0.f(str, sb.toString());
    }

    private static int s(Response.StatusCode statusCode) {
        if (statusCode == Response.StatusCode.SERVICE_FAILURE) {
            return 1;
        }
        if (statusCode == Response.StatusCode.PARAMS_FAILURE) {
            return 2;
        }
        if (statusCode == Response.StatusCode.INTERNAL_FAILURE) {
            return 3;
        }
        return statusCode == Response.StatusCode.UN_LOGIN_FAILURE ? 0 : -1;
    }
}
