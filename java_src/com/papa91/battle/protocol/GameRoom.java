package com.papa91.battle.protocol;

import com.android.dx.io.Opcodes;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.papa91.battle.protocol.BattleServerAddr;
import com.papa91.battle.protocol.RoomPosition;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Objects;
/* loaded from: classes5.dex */
public final class GameRoom extends GeneratedMessageLite<GameRoom, Builder> implements Serializable, GameRoomOrBuilder {
    public static final int ALLOWPCJOIN_FIELD_NUMBER = 29;
    public static final int ALLOWPERIPHERALJOIN_FIELD_NUMBER = 6;
    public static final int ALLOWSPECTATORJOIN_FIELD_NUMBER = 5;
    public static final int BATTLEAREA_FIELD_NUMBER = 26;
    public static final int BATTLESERVERADDR_FIELD_NUMBER = 21;
    public static final int CHALLENGECOINS_FIELD_NUMBER = 12;
    public static final int CHATROOMID_FIELD_NUMBER = 33;
    public static final int COLLECTIONID_FIELD_NUMBER = 28;
    public static final int CREATEAT_FIELD_NUMBER = 22;
    public static final int CREATEBYUSER_FIELD_NUMBER = 32;
    private static final GameRoom DEFAULT_INSTANCE;
    public static final int DISABLEMOBILEJOIN_FIELD_NUMBER = 31;
    public static final int ELITE_FIELD_NUMBER = 18;
    public static final int FASTMODE_FIELD_NUMBER = 19;
    public static final int FIGHTID_FIELD_NUMBER = 20;
    public static final int GAMEID_FIELD_NUMBER = 2;
    public static final int GAMENAME_FIELD_NUMBER = 27;
    public static final int GAMETYPE_FIELD_NUMBER = 25;
    public static final int HASJOINPASSWORD_FIELD_NUMBER = 4;
    public static final int LEADER_FIELD_NUMBER = 16;
    public static final int OPENBATTLESCORE_FIELD_NUMBER = 35;
    public static final int OPENFASTMODEBTN_FIELD_NUMBER = 30;
    public static final int P1_FIELD_NUMBER = 8;
    public static final int P2_FIELD_NUMBER = 9;
    public static final int P3_FIELD_NUMBER = 10;
    public static final int P4_FIELD_NUMBER = 11;
    private static volatile Parser<GameRoom> PARSER = null;
    public static final int PASSWORD_FIELD_NUMBER = 3;
    public static final int PLAYERNUMBER_FIELD_NUMBER = 13;
    public static final int PLAYERSECONDS_FIELD_NUMBER = 17;
    public static final int PLAYTIMESTAMP_FIELD_NUMBER = 24;
    public static final int ROOMCATEGORY_FIELD_NUMBER = 34;
    public static final int ROOMID_FIELD_NUMBER = 1;
    public static final int SEATSNUMBER_FIELD_NUMBER = 14;
    public static final int SILENT_FIELD_NUMBER = 23;
    public static final int SPECTATORNUMBER_FIELD_NUMBER = 7;
    public static final int STATE_FIELD_NUMBER = 15;
    private boolean allowPCJoin_;
    private boolean allowPeripheralJoin_;
    private boolean allowSpectatorJoin_;
    private int battleArea_;
    private BattleServerAddr battleServerAddr_;
    private int challengeCoins_;
    private int collectionId_;
    private long createAt_;
    private int createByUser_;
    private boolean disableMobileJoin_;
    private boolean elite_;
    private boolean fastMode_;
    private long fightId_;
    private long gameId_;
    private int gameType_;
    private boolean hasJoinPassword_;
    private int leader_;
    private boolean openBattleScore_;
    private boolean openFastModeBtn_;
    private RoomPosition p1_;
    private RoomPosition p2_;
    private RoomPosition p3_;
    private RoomPosition p4_;
    private long playTimestamp_;
    private int playerNumber_;
    private int playerSeconds_;
    private int roomCategory_;
    private int roomId_;
    private int seatsNumber_;
    private boolean silent_;
    private int spectatorNumber_;
    private int state_;
    private String password_ = "";
    private String gameName_ = "";
    private String chatRoomId_ = "";

    /* renamed from: com.papa91.battle.protocol.GameRoom$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<GameRoom, Builder> implements GameRoomOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        public Builder clearAllowPCJoin() {
            copyOnWrite();
            ((GameRoom) this.instance).clearAllowPCJoin();
            return this;
        }

        public Builder clearAllowPeripheralJoin() {
            copyOnWrite();
            ((GameRoom) this.instance).clearAllowPeripheralJoin();
            return this;
        }

        public Builder clearAllowSpectatorJoin() {
            copyOnWrite();
            ((GameRoom) this.instance).clearAllowSpectatorJoin();
            return this;
        }

        public Builder clearBattleArea() {
            copyOnWrite();
            ((GameRoom) this.instance).clearBattleArea();
            return this;
        }

        public Builder clearBattleServerAddr() {
            copyOnWrite();
            ((GameRoom) this.instance).clearBattleServerAddr();
            return this;
        }

        public Builder clearChallengeCoins() {
            copyOnWrite();
            ((GameRoom) this.instance).clearChallengeCoins();
            return this;
        }

        public Builder clearChatRoomId() {
            copyOnWrite();
            ((GameRoom) this.instance).clearChatRoomId();
            return this;
        }

        public Builder clearCollectionId() {
            copyOnWrite();
            ((GameRoom) this.instance).clearCollectionId();
            return this;
        }

        public Builder clearCreateAt() {
            copyOnWrite();
            ((GameRoom) this.instance).clearCreateAt();
            return this;
        }

        public Builder clearCreateByUser() {
            copyOnWrite();
            ((GameRoom) this.instance).clearCreateByUser();
            return this;
        }

        public Builder clearDisableMobileJoin() {
            copyOnWrite();
            ((GameRoom) this.instance).clearDisableMobileJoin();
            return this;
        }

        public Builder clearElite() {
            copyOnWrite();
            ((GameRoom) this.instance).clearElite();
            return this;
        }

        public Builder clearFastMode() {
            copyOnWrite();
            ((GameRoom) this.instance).clearFastMode();
            return this;
        }

        public Builder clearFightId() {
            copyOnWrite();
            ((GameRoom) this.instance).clearFightId();
            return this;
        }

        public Builder clearGameId() {
            copyOnWrite();
            ((GameRoom) this.instance).clearGameId();
            return this;
        }

        public Builder clearGameName() {
            copyOnWrite();
            ((GameRoom) this.instance).clearGameName();
            return this;
        }

        public Builder clearGameType() {
            copyOnWrite();
            ((GameRoom) this.instance).clearGameType();
            return this;
        }

        public Builder clearHasJoinPassword() {
            copyOnWrite();
            ((GameRoom) this.instance).clearHasJoinPassword();
            return this;
        }

        public Builder clearLeader() {
            copyOnWrite();
            ((GameRoom) this.instance).clearLeader();
            return this;
        }

        public Builder clearOpenBattleScore() {
            copyOnWrite();
            ((GameRoom) this.instance).clearOpenBattleScore();
            return this;
        }

        public Builder clearOpenFastModeBtn() {
            copyOnWrite();
            ((GameRoom) this.instance).clearOpenFastModeBtn();
            return this;
        }

        public Builder clearP1() {
            copyOnWrite();
            ((GameRoom) this.instance).clearP1();
            return this;
        }

        public Builder clearP2() {
            copyOnWrite();
            ((GameRoom) this.instance).clearP2();
            return this;
        }

        public Builder clearP3() {
            copyOnWrite();
            ((GameRoom) this.instance).clearP3();
            return this;
        }

        public Builder clearP4() {
            copyOnWrite();
            ((GameRoom) this.instance).clearP4();
            return this;
        }

        public Builder clearPassword() {
            copyOnWrite();
            ((GameRoom) this.instance).clearPassword();
            return this;
        }

        public Builder clearPlayTimestamp() {
            copyOnWrite();
            ((GameRoom) this.instance).clearPlayTimestamp();
            return this;
        }

        public Builder clearPlayerNumber() {
            copyOnWrite();
            ((GameRoom) this.instance).clearPlayerNumber();
            return this;
        }

        public Builder clearPlayerSeconds() {
            copyOnWrite();
            ((GameRoom) this.instance).clearPlayerSeconds();
            return this;
        }

        public Builder clearRoomCategory() {
            copyOnWrite();
            ((GameRoom) this.instance).clearRoomCategory();
            return this;
        }

        public Builder clearRoomId() {
            copyOnWrite();
            ((GameRoom) this.instance).clearRoomId();
            return this;
        }

        public Builder clearSeatsNumber() {
            copyOnWrite();
            ((GameRoom) this.instance).clearSeatsNumber();
            return this;
        }

        public Builder clearSilent() {
            copyOnWrite();
            ((GameRoom) this.instance).clearSilent();
            return this;
        }

        public Builder clearSpectatorNumber() {
            copyOnWrite();
            ((GameRoom) this.instance).clearSpectatorNumber();
            return this;
        }

        public Builder clearState() {
            copyOnWrite();
            ((GameRoom) this.instance).clearState();
            return this;
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public boolean getAllowPCJoin() {
            return ((GameRoom) this.instance).getAllowPCJoin();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public boolean getAllowPeripheralJoin() {
            return ((GameRoom) this.instance).getAllowPeripheralJoin();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public boolean getAllowSpectatorJoin() {
            return ((GameRoom) this.instance).getAllowSpectatorJoin();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public BattleArea getBattleArea() {
            return ((GameRoom) this.instance).getBattleArea();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public int getBattleAreaValue() {
            return ((GameRoom) this.instance).getBattleAreaValue();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public BattleServerAddr getBattleServerAddr() {
            return ((GameRoom) this.instance).getBattleServerAddr();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public int getChallengeCoins() {
            return ((GameRoom) this.instance).getChallengeCoins();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public String getChatRoomId() {
            return ((GameRoom) this.instance).getChatRoomId();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public ByteString getChatRoomIdBytes() {
            return ((GameRoom) this.instance).getChatRoomIdBytes();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public int getCollectionId() {
            return ((GameRoom) this.instance).getCollectionId();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public long getCreateAt() {
            return ((GameRoom) this.instance).getCreateAt();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public int getCreateByUser() {
            return ((GameRoom) this.instance).getCreateByUser();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public boolean getDisableMobileJoin() {
            return ((GameRoom) this.instance).getDisableMobileJoin();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public boolean getElite() {
            return ((GameRoom) this.instance).getElite();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public boolean getFastMode() {
            return ((GameRoom) this.instance).getFastMode();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public long getFightId() {
            return ((GameRoom) this.instance).getFightId();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public long getGameId() {
            return ((GameRoom) this.instance).getGameId();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public String getGameName() {
            return ((GameRoom) this.instance).getGameName();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public ByteString getGameNameBytes() {
            return ((GameRoom) this.instance).getGameNameBytes();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public GameType getGameType() {
            return ((GameRoom) this.instance).getGameType();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public int getGameTypeValue() {
            return ((GameRoom) this.instance).getGameTypeValue();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public boolean getHasJoinPassword() {
            return ((GameRoom) this.instance).getHasJoinPassword();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public int getLeader() {
            return ((GameRoom) this.instance).getLeader();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public boolean getOpenBattleScore() {
            return ((GameRoom) this.instance).getOpenBattleScore();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public boolean getOpenFastModeBtn() {
            return ((GameRoom) this.instance).getOpenFastModeBtn();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public RoomPosition getP1() {
            return ((GameRoom) this.instance).getP1();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public RoomPosition getP2() {
            return ((GameRoom) this.instance).getP2();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public RoomPosition getP3() {
            return ((GameRoom) this.instance).getP3();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public RoomPosition getP4() {
            return ((GameRoom) this.instance).getP4();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public String getPassword() {
            return ((GameRoom) this.instance).getPassword();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public ByteString getPasswordBytes() {
            return ((GameRoom) this.instance).getPasswordBytes();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public long getPlayTimestamp() {
            return ((GameRoom) this.instance).getPlayTimestamp();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public int getPlayerNumber() {
            return ((GameRoom) this.instance).getPlayerNumber();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public int getPlayerSeconds() {
            return ((GameRoom) this.instance).getPlayerSeconds();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public RoomCategory getRoomCategory() {
            return ((GameRoom) this.instance).getRoomCategory();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public int getRoomCategoryValue() {
            return ((GameRoom) this.instance).getRoomCategoryValue();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public int getRoomId() {
            return ((GameRoom) this.instance).getRoomId();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public int getSeatsNumber() {
            return ((GameRoom) this.instance).getSeatsNumber();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public boolean getSilent() {
            return ((GameRoom) this.instance).getSilent();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public int getSpectatorNumber() {
            return ((GameRoom) this.instance).getSpectatorNumber();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public RoomState getState() {
            return ((GameRoom) this.instance).getState();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public int getStateValue() {
            return ((GameRoom) this.instance).getStateValue();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public boolean hasBattleServerAddr() {
            return ((GameRoom) this.instance).hasBattleServerAddr();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public boolean hasP1() {
            return ((GameRoom) this.instance).hasP1();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public boolean hasP2() {
            return ((GameRoom) this.instance).hasP2();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public boolean hasP3() {
            return ((GameRoom) this.instance).hasP3();
        }

        @Override // com.papa91.battle.protocol.GameRoomOrBuilder
        public boolean hasP4() {
            return ((GameRoom) this.instance).hasP4();
        }

        public Builder mergeBattleServerAddr(BattleServerAddr battleServerAddr) {
            copyOnWrite();
            ((GameRoom) this.instance).mergeBattleServerAddr(battleServerAddr);
            return this;
        }

        public Builder mergeP1(RoomPosition roomPosition) {
            copyOnWrite();
            ((GameRoom) this.instance).mergeP1(roomPosition);
            return this;
        }

        public Builder mergeP2(RoomPosition roomPosition) {
            copyOnWrite();
            ((GameRoom) this.instance).mergeP2(roomPosition);
            return this;
        }

        public Builder mergeP3(RoomPosition roomPosition) {
            copyOnWrite();
            ((GameRoom) this.instance).mergeP3(roomPosition);
            return this;
        }

        public Builder mergeP4(RoomPosition roomPosition) {
            copyOnWrite();
            ((GameRoom) this.instance).mergeP4(roomPosition);
            return this;
        }

        public Builder setAllowPCJoin(boolean z4) {
            copyOnWrite();
            ((GameRoom) this.instance).setAllowPCJoin(z4);
            return this;
        }

        public Builder setAllowPeripheralJoin(boolean z4) {
            copyOnWrite();
            ((GameRoom) this.instance).setAllowPeripheralJoin(z4);
            return this;
        }

        public Builder setAllowSpectatorJoin(boolean z4) {
            copyOnWrite();
            ((GameRoom) this.instance).setAllowSpectatorJoin(z4);
            return this;
        }

        public Builder setBattleArea(BattleArea battleArea) {
            copyOnWrite();
            ((GameRoom) this.instance).setBattleArea(battleArea);
            return this;
        }

        public Builder setBattleAreaValue(int i4) {
            copyOnWrite();
            ((GameRoom) this.instance).setBattleAreaValue(i4);
            return this;
        }

        public Builder setBattleServerAddr(BattleServerAddr battleServerAddr) {
            copyOnWrite();
            ((GameRoom) this.instance).setBattleServerAddr(battleServerAddr);
            return this;
        }

        public Builder setChallengeCoins(int i4) {
            copyOnWrite();
            ((GameRoom) this.instance).setChallengeCoins(i4);
            return this;
        }

        public Builder setChatRoomId(String str) {
            copyOnWrite();
            ((GameRoom) this.instance).setChatRoomId(str);
            return this;
        }

        public Builder setChatRoomIdBytes(ByteString byteString) {
            copyOnWrite();
            ((GameRoom) this.instance).setChatRoomIdBytes(byteString);
            return this;
        }

        public Builder setCollectionId(int i4) {
            copyOnWrite();
            ((GameRoom) this.instance).setCollectionId(i4);
            return this;
        }

        public Builder setCreateAt(long j4) {
            copyOnWrite();
            ((GameRoom) this.instance).setCreateAt(j4);
            return this;
        }

        public Builder setCreateByUser(int i4) {
            copyOnWrite();
            ((GameRoom) this.instance).setCreateByUser(i4);
            return this;
        }

        public Builder setDisableMobileJoin(boolean z4) {
            copyOnWrite();
            ((GameRoom) this.instance).setDisableMobileJoin(z4);
            return this;
        }

        public Builder setElite(boolean z4) {
            copyOnWrite();
            ((GameRoom) this.instance).setElite(z4);
            return this;
        }

        public Builder setFastMode(boolean z4) {
            copyOnWrite();
            ((GameRoom) this.instance).setFastMode(z4);
            return this;
        }

        public Builder setFightId(long j4) {
            copyOnWrite();
            ((GameRoom) this.instance).setFightId(j4);
            return this;
        }

        public Builder setGameId(long j4) {
            copyOnWrite();
            ((GameRoom) this.instance).setGameId(j4);
            return this;
        }

        public Builder setGameName(String str) {
            copyOnWrite();
            ((GameRoom) this.instance).setGameName(str);
            return this;
        }

        public Builder setGameNameBytes(ByteString byteString) {
            copyOnWrite();
            ((GameRoom) this.instance).setGameNameBytes(byteString);
            return this;
        }

        public Builder setGameType(GameType gameType) {
            copyOnWrite();
            ((GameRoom) this.instance).setGameType(gameType);
            return this;
        }

        public Builder setGameTypeValue(int i4) {
            copyOnWrite();
            ((GameRoom) this.instance).setGameTypeValue(i4);
            return this;
        }

        public Builder setHasJoinPassword(boolean z4) {
            copyOnWrite();
            ((GameRoom) this.instance).setHasJoinPassword(z4);
            return this;
        }

        public Builder setLeader(int i4) {
            copyOnWrite();
            ((GameRoom) this.instance).setLeader(i4);
            return this;
        }

        public Builder setOpenBattleScore(boolean z4) {
            copyOnWrite();
            ((GameRoom) this.instance).setOpenBattleScore(z4);
            return this;
        }

        public Builder setOpenFastModeBtn(boolean z4) {
            copyOnWrite();
            ((GameRoom) this.instance).setOpenFastModeBtn(z4);
            return this;
        }

        public Builder setP1(RoomPosition roomPosition) {
            copyOnWrite();
            ((GameRoom) this.instance).setP1(roomPosition);
            return this;
        }

        public Builder setP2(RoomPosition roomPosition) {
            copyOnWrite();
            ((GameRoom) this.instance).setP2(roomPosition);
            return this;
        }

        public Builder setP3(RoomPosition roomPosition) {
            copyOnWrite();
            ((GameRoom) this.instance).setP3(roomPosition);
            return this;
        }

        public Builder setP4(RoomPosition roomPosition) {
            copyOnWrite();
            ((GameRoom) this.instance).setP4(roomPosition);
            return this;
        }

        public Builder setPassword(String str) {
            copyOnWrite();
            ((GameRoom) this.instance).setPassword(str);
            return this;
        }

        public Builder setPasswordBytes(ByteString byteString) {
            copyOnWrite();
            ((GameRoom) this.instance).setPasswordBytes(byteString);
            return this;
        }

        public Builder setPlayTimestamp(long j4) {
            copyOnWrite();
            ((GameRoom) this.instance).setPlayTimestamp(j4);
            return this;
        }

        public Builder setPlayerNumber(int i4) {
            copyOnWrite();
            ((GameRoom) this.instance).setPlayerNumber(i4);
            return this;
        }

        public Builder setPlayerSeconds(int i4) {
            copyOnWrite();
            ((GameRoom) this.instance).setPlayerSeconds(i4);
            return this;
        }

        public Builder setRoomCategory(RoomCategory roomCategory) {
            copyOnWrite();
            ((GameRoom) this.instance).setRoomCategory(roomCategory);
            return this;
        }

        public Builder setRoomCategoryValue(int i4) {
            copyOnWrite();
            ((GameRoom) this.instance).setRoomCategoryValue(i4);
            return this;
        }

        public Builder setRoomId(int i4) {
            copyOnWrite();
            ((GameRoom) this.instance).setRoomId(i4);
            return this;
        }

        public Builder setSeatsNumber(int i4) {
            copyOnWrite();
            ((GameRoom) this.instance).setSeatsNumber(i4);
            return this;
        }

        public Builder setSilent(boolean z4) {
            copyOnWrite();
            ((GameRoom) this.instance).setSilent(z4);
            return this;
        }

        public Builder setSpectatorNumber(int i4) {
            copyOnWrite();
            ((GameRoom) this.instance).setSpectatorNumber(i4);
            return this;
        }

        public Builder setState(RoomState roomState) {
            copyOnWrite();
            ((GameRoom) this.instance).setState(roomState);
            return this;
        }

        public Builder setStateValue(int i4) {
            copyOnWrite();
            ((GameRoom) this.instance).setStateValue(i4);
            return this;
        }

        private Builder() {
            super(GameRoom.DEFAULT_INSTANCE);
        }

        public Builder setBattleServerAddr(BattleServerAddr.Builder builder) {
            copyOnWrite();
            ((GameRoom) this.instance).setBattleServerAddr(builder);
            return this;
        }

        public Builder setP1(RoomPosition.Builder builder) {
            copyOnWrite();
            ((GameRoom) this.instance).setP1(builder);
            return this;
        }

        public Builder setP2(RoomPosition.Builder builder) {
            copyOnWrite();
            ((GameRoom) this.instance).setP2(builder);
            return this;
        }

        public Builder setP3(RoomPosition.Builder builder) {
            copyOnWrite();
            ((GameRoom) this.instance).setP3(builder);
            return this;
        }

        public Builder setP4(RoomPosition.Builder builder) {
            copyOnWrite();
            ((GameRoom) this.instance).setP4(builder);
            return this;
        }
    }

    /* loaded from: classes5.dex */
    public enum GameType implements Internal.EnumLite {
        FIGHT(0),
        LEVEL(1),
        UNRECOGNIZED(-1);
        
        public static final int FIGHT_VALUE = 0;
        public static final int LEVEL_VALUE = 1;
        private static final Internal.EnumLiteMap<GameType> internalValueMap = new Internal.EnumLiteMap<GameType>() { // from class: com.papa91.battle.protocol.GameRoom.GameType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public GameType findValueByNumber(int i4) {
                return GameType.forNumber(i4);
            }
        };
        private final int value;

        GameType(int i4) {
            this.value = i4;
        }

        public static GameType forNumber(int i4) {
            if (i4 != 0) {
                if (i4 != 1) {
                    return null;
                }
                return LEVEL;
            }
            return FIGHT;
        }

        public static Internal.EnumLiteMap<GameType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static GameType valueOf(int i4) {
            return forNumber(i4);
        }
    }

    static {
        GameRoom gameRoom = new GameRoom();
        DEFAULT_INSTANCE = gameRoom;
        gameRoom.makeImmutable();
    }

    private GameRoom() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowPCJoin() {
        this.allowPCJoin_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowPeripheralJoin() {
        this.allowPeripheralJoin_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowSpectatorJoin() {
        this.allowSpectatorJoin_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBattleArea() {
        this.battleArea_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBattleServerAddr() {
        this.battleServerAddr_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChallengeCoins() {
        this.challengeCoins_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChatRoomId() {
        this.chatRoomId_ = getDefaultInstance().getChatRoomId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCollectionId() {
        this.collectionId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreateAt() {
        this.createAt_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreateByUser() {
        this.createByUser_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisableMobileJoin() {
        this.disableMobileJoin_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearElite() {
        this.elite_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFastMode() {
        this.fastMode_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFightId() {
        this.fightId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGameId() {
        this.gameId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGameName() {
        this.gameName_ = getDefaultInstance().getGameName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGameType() {
        this.gameType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasJoinPassword() {
        this.hasJoinPassword_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLeader() {
        this.leader_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOpenBattleScore() {
        this.openBattleScore_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOpenFastModeBtn() {
        this.openFastModeBtn_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearP1() {
        this.p1_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearP2() {
        this.p2_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearP3() {
        this.p3_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearP4() {
        this.p4_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPassword() {
        this.password_ = getDefaultInstance().getPassword();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayTimestamp() {
        this.playTimestamp_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayerNumber() {
        this.playerNumber_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayerSeconds() {
        this.playerSeconds_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoomCategory() {
        this.roomCategory_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoomId() {
        this.roomId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeatsNumber() {
        this.seatsNumber_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSilent() {
        this.silent_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpectatorNumber() {
        this.spectatorNumber_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = 0;
    }

    public static GameRoom getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBattleServerAddr(BattleServerAddr battleServerAddr) {
        BattleServerAddr battleServerAddr2 = this.battleServerAddr_;
        if (battleServerAddr2 != null && battleServerAddr2 != BattleServerAddr.getDefaultInstance()) {
            this.battleServerAddr_ = BattleServerAddr.newBuilder(this.battleServerAddr_).mergeFrom((BattleServerAddr.Builder) battleServerAddr).buildPartial();
        } else {
            this.battleServerAddr_ = battleServerAddr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeP1(RoomPosition roomPosition) {
        RoomPosition roomPosition2 = this.p1_;
        if (roomPosition2 != null && roomPosition2 != RoomPosition.getDefaultInstance()) {
            this.p1_ = RoomPosition.newBuilder(this.p1_).mergeFrom((RoomPosition.Builder) roomPosition).buildPartial();
        } else {
            this.p1_ = roomPosition;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeP2(RoomPosition roomPosition) {
        RoomPosition roomPosition2 = this.p2_;
        if (roomPosition2 != null && roomPosition2 != RoomPosition.getDefaultInstance()) {
            this.p2_ = RoomPosition.newBuilder(this.p2_).mergeFrom((RoomPosition.Builder) roomPosition).buildPartial();
        } else {
            this.p2_ = roomPosition;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeP3(RoomPosition roomPosition) {
        RoomPosition roomPosition2 = this.p3_;
        if (roomPosition2 != null && roomPosition2 != RoomPosition.getDefaultInstance()) {
            this.p3_ = RoomPosition.newBuilder(this.p3_).mergeFrom((RoomPosition.Builder) roomPosition).buildPartial();
        } else {
            this.p3_ = roomPosition;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeP4(RoomPosition roomPosition) {
        RoomPosition roomPosition2 = this.p4_;
        if (roomPosition2 != null && roomPosition2 != RoomPosition.getDefaultInstance()) {
            this.p4_ = RoomPosition.newBuilder(this.p4_).mergeFrom((RoomPosition.Builder) roomPosition).buildPartial();
        } else {
            this.p4_ = roomPosition;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static GameRoom parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GameRoom) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GameRoom parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (GameRoom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<GameRoom> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowPCJoin(boolean z4) {
        this.allowPCJoin_ = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowPeripheralJoin(boolean z4) {
        this.allowPeripheralJoin_ = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowSpectatorJoin(boolean z4) {
        this.allowSpectatorJoin_ = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBattleArea(BattleArea battleArea) {
        Objects.requireNonNull(battleArea);
        this.battleArea_ = battleArea.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBattleAreaValue(int i4) {
        this.battleArea_ = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBattleServerAddr(BattleServerAddr battleServerAddr) {
        Objects.requireNonNull(battleServerAddr);
        this.battleServerAddr_ = battleServerAddr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChallengeCoins(int i4) {
        this.challengeCoins_ = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChatRoomId(String str) {
        Objects.requireNonNull(str);
        this.chatRoomId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChatRoomIdBytes(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.chatRoomId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCollectionId(int i4) {
        this.collectionId_ = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreateAt(long j4) {
        this.createAt_ = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreateByUser(int i4) {
        this.createByUser_ = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisableMobileJoin(boolean z4) {
        this.disableMobileJoin_ = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setElite(boolean z4) {
        this.elite_ = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFastMode(boolean z4) {
        this.fastMode_ = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFightId(long j4) {
        this.fightId_ = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGameId(long j4) {
        this.gameId_ = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGameName(String str) {
        Objects.requireNonNull(str);
        this.gameName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGameNameBytes(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.gameName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGameType(GameType gameType) {
        Objects.requireNonNull(gameType);
        this.gameType_ = gameType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGameTypeValue(int i4) {
        this.gameType_ = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasJoinPassword(boolean z4) {
        this.hasJoinPassword_ = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLeader(int i4) {
        this.leader_ = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpenBattleScore(boolean z4) {
        this.openBattleScore_ = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpenFastModeBtn(boolean z4) {
        this.openFastModeBtn_ = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setP1(RoomPosition roomPosition) {
        Objects.requireNonNull(roomPosition);
        this.p1_ = roomPosition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setP2(RoomPosition roomPosition) {
        Objects.requireNonNull(roomPosition);
        this.p2_ = roomPosition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setP3(RoomPosition roomPosition) {
        Objects.requireNonNull(roomPosition);
        this.p3_ = roomPosition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setP4(RoomPosition roomPosition) {
        Objects.requireNonNull(roomPosition);
        this.p4_ = roomPosition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPassword(String str) {
        Objects.requireNonNull(str);
        this.password_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPasswordBytes(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.password_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayTimestamp(long j4) {
        this.playTimestamp_ = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerNumber(int i4) {
        this.playerNumber_ = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerSeconds(int i4) {
        this.playerSeconds_ = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomCategory(RoomCategory roomCategory) {
        Objects.requireNonNull(roomCategory);
        this.roomCategory_ = roomCategory.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomCategoryValue(int i4) {
        this.roomCategory_ = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomId(int i4) {
        this.roomId_ = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeatsNumber(int i4) {
        this.seatsNumber_ = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSilent(boolean z4) {
        this.silent_ = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpectatorNumber(int i4) {
        this.spectatorNumber_ = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(RoomState roomState) {
        Objects.requireNonNull(roomState);
        this.state_ = roomState.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateValue(int i4) {
        this.state_ = i4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new GameRoom();
            case 2:
                return DEFAULT_INSTANCE;
            case 3:
                return null;
            case 4:
                return new Builder(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                GameRoom gameRoom = (GameRoom) obj2;
                int i4 = this.roomId_;
                boolean z4 = i4 != 0;
                int i5 = gameRoom.roomId_;
                this.roomId_ = visitor.visitInt(z4, i4, i5 != 0, i5);
                long j4 = this.gameId_;
                boolean z5 = j4 != 0;
                long j5 = gameRoom.gameId_;
                this.gameId_ = visitor.visitLong(z5, j4, j5 != 0, j5);
                this.password_ = visitor.visitString(!this.password_.isEmpty(), this.password_, !gameRoom.password_.isEmpty(), gameRoom.password_);
                boolean z6 = this.hasJoinPassword_;
                boolean z7 = gameRoom.hasJoinPassword_;
                this.hasJoinPassword_ = visitor.visitBoolean(z6, z6, z7, z7);
                boolean z8 = this.allowSpectatorJoin_;
                boolean z9 = gameRoom.allowSpectatorJoin_;
                this.allowSpectatorJoin_ = visitor.visitBoolean(z8, z8, z9, z9);
                boolean z10 = this.allowPeripheralJoin_;
                boolean z11 = gameRoom.allowPeripheralJoin_;
                this.allowPeripheralJoin_ = visitor.visitBoolean(z10, z10, z11, z11);
                int i6 = this.spectatorNumber_;
                boolean z12 = i6 != 0;
                int i7 = gameRoom.spectatorNumber_;
                this.spectatorNumber_ = visitor.visitInt(z12, i6, i7 != 0, i7);
                this.p1_ = (RoomPosition) visitor.visitMessage(this.p1_, gameRoom.p1_);
                this.p2_ = (RoomPosition) visitor.visitMessage(this.p2_, gameRoom.p2_);
                this.p3_ = (RoomPosition) visitor.visitMessage(this.p3_, gameRoom.p3_);
                this.p4_ = (RoomPosition) visitor.visitMessage(this.p4_, gameRoom.p4_);
                int i8 = this.challengeCoins_;
                boolean z13 = i8 != 0;
                int i9 = gameRoom.challengeCoins_;
                this.challengeCoins_ = visitor.visitInt(z13, i8, i9 != 0, i9);
                int i10 = this.playerNumber_;
                boolean z14 = i10 != 0;
                int i11 = gameRoom.playerNumber_;
                this.playerNumber_ = visitor.visitInt(z14, i10, i11 != 0, i11);
                int i12 = this.seatsNumber_;
                boolean z15 = i12 != 0;
                int i13 = gameRoom.seatsNumber_;
                this.seatsNumber_ = visitor.visitInt(z15, i12, i13 != 0, i13);
                int i14 = this.state_;
                boolean z16 = i14 != 0;
                int i15 = gameRoom.state_;
                this.state_ = visitor.visitInt(z16, i14, i15 != 0, i15);
                int i16 = this.leader_;
                boolean z17 = i16 != 0;
                int i17 = gameRoom.leader_;
                this.leader_ = visitor.visitInt(z17, i16, i17 != 0, i17);
                int i18 = this.playerSeconds_;
                boolean z18 = i18 != 0;
                int i19 = gameRoom.playerSeconds_;
                this.playerSeconds_ = visitor.visitInt(z18, i18, i19 != 0, i19);
                boolean z19 = this.elite_;
                boolean z20 = gameRoom.elite_;
                this.elite_ = visitor.visitBoolean(z19, z19, z20, z20);
                boolean z21 = this.fastMode_;
                boolean z22 = gameRoom.fastMode_;
                this.fastMode_ = visitor.visitBoolean(z21, z21, z22, z22);
                long j6 = this.fightId_;
                boolean z23 = j6 != 0;
                long j7 = gameRoom.fightId_;
                this.fightId_ = visitor.visitLong(z23, j6, j7 != 0, j7);
                this.battleServerAddr_ = (BattleServerAddr) visitor.visitMessage(this.battleServerAddr_, gameRoom.battleServerAddr_);
                long j8 = this.createAt_;
                boolean z24 = j8 != 0;
                long j9 = gameRoom.createAt_;
                this.createAt_ = visitor.visitLong(z24, j8, j9 != 0, j9);
                boolean z25 = this.silent_;
                boolean z26 = gameRoom.silent_;
                this.silent_ = visitor.visitBoolean(z25, z25, z26, z26);
                long j10 = this.playTimestamp_;
                boolean z27 = j10 != 0;
                long j11 = gameRoom.playTimestamp_;
                this.playTimestamp_ = visitor.visitLong(z27, j10, j11 != 0, j11);
                int i20 = this.gameType_;
                boolean z28 = i20 != 0;
                int i21 = gameRoom.gameType_;
                this.gameType_ = visitor.visitInt(z28, i20, i21 != 0, i21);
                int i22 = this.battleArea_;
                boolean z29 = i22 != 0;
                int i23 = gameRoom.battleArea_;
                this.battleArea_ = visitor.visitInt(z29, i22, i23 != 0, i23);
                this.gameName_ = visitor.visitString(!this.gameName_.isEmpty(), this.gameName_, !gameRoom.gameName_.isEmpty(), gameRoom.gameName_);
                int i24 = this.collectionId_;
                boolean z30 = i24 != 0;
                int i25 = gameRoom.collectionId_;
                this.collectionId_ = visitor.visitInt(z30, i24, i25 != 0, i25);
                boolean z31 = this.allowPCJoin_;
                boolean z32 = gameRoom.allowPCJoin_;
                this.allowPCJoin_ = visitor.visitBoolean(z31, z31, z32, z32);
                boolean z33 = this.openFastModeBtn_;
                boolean z34 = gameRoom.openFastModeBtn_;
                this.openFastModeBtn_ = visitor.visitBoolean(z33, z33, z34, z34);
                boolean z35 = this.disableMobileJoin_;
                boolean z36 = gameRoom.disableMobileJoin_;
                this.disableMobileJoin_ = visitor.visitBoolean(z35, z35, z36, z36);
                int i26 = this.createByUser_;
                boolean z37 = i26 != 0;
                int i27 = gameRoom.createByUser_;
                this.createByUser_ = visitor.visitInt(z37, i26, i27 != 0, i27);
                this.chatRoomId_ = visitor.visitString(!this.chatRoomId_.isEmpty(), this.chatRoomId_, !gameRoom.chatRoomId_.isEmpty(), gameRoom.chatRoomId_);
                int i28 = this.roomCategory_;
                boolean z38 = i28 != 0;
                int i29 = gameRoom.roomCategory_;
                this.roomCategory_ = visitor.visitInt(z38, i28, i29 != 0, i29);
                boolean z39 = this.openBattleScore_;
                boolean z40 = gameRoom.openBattleScore_;
                this.openBattleScore_ = visitor.visitBoolean(z39, z39, z40, z40);
                GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!r1) {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case 0:
                                break;
                            case 8:
                                this.roomId_ = codedInputStream.readInt32();
                                continue;
                            case 16:
                                this.gameId_ = codedInputStream.readInt64();
                                continue;
                            case 26:
                                this.password_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 32:
                                this.hasJoinPassword_ = codedInputStream.readBool();
                                continue;
                            case 40:
                                this.allowSpectatorJoin_ = codedInputStream.readBool();
                                continue;
                            case 48:
                                this.allowPeripheralJoin_ = codedInputStream.readBool();
                                continue;
                            case 56:
                                this.spectatorNumber_ = codedInputStream.readInt32();
                                continue;
                            case 66:
                                RoomPosition roomPosition = this.p1_;
                                RoomPosition.Builder builder = roomPosition != null ? roomPosition.toBuilder() : null;
                                RoomPosition roomPosition2 = (RoomPosition) codedInputStream.readMessage(RoomPosition.parser(), extensionRegistryLite);
                                this.p1_ = roomPosition2;
                                if (builder != null) {
                                    builder.mergeFrom((RoomPosition.Builder) roomPosition2);
                                    this.p1_ = builder.buildPartial();
                                } else {
                                    continue;
                                }
                            case 74:
                                RoomPosition roomPosition3 = this.p2_;
                                RoomPosition.Builder builder2 = roomPosition3 != null ? roomPosition3.toBuilder() : null;
                                RoomPosition roomPosition4 = (RoomPosition) codedInputStream.readMessage(RoomPosition.parser(), extensionRegistryLite);
                                this.p2_ = roomPosition4;
                                if (builder2 != null) {
                                    builder2.mergeFrom((RoomPosition.Builder) roomPosition4);
                                    this.p2_ = builder2.buildPartial();
                                } else {
                                    continue;
                                }
                            case 82:
                                RoomPosition roomPosition5 = this.p3_;
                                RoomPosition.Builder builder3 = roomPosition5 != null ? roomPosition5.toBuilder() : null;
                                RoomPosition roomPosition6 = (RoomPosition) codedInputStream.readMessage(RoomPosition.parser(), extensionRegistryLite);
                                this.p3_ = roomPosition6;
                                if (builder3 != null) {
                                    builder3.mergeFrom((RoomPosition.Builder) roomPosition6);
                                    this.p3_ = builder3.buildPartial();
                                } else {
                                    continue;
                                }
                            case 90:
                                RoomPosition roomPosition7 = this.p4_;
                                RoomPosition.Builder builder4 = roomPosition7 != null ? roomPosition7.toBuilder() : null;
                                RoomPosition roomPosition8 = (RoomPosition) codedInputStream.readMessage(RoomPosition.parser(), extensionRegistryLite);
                                this.p4_ = roomPosition8;
                                if (builder4 != null) {
                                    builder4.mergeFrom((RoomPosition.Builder) roomPosition8);
                                    this.p4_ = builder4.buildPartial();
                                } else {
                                    continue;
                                }
                            case 96:
                                this.challengeCoins_ = codedInputStream.readInt32();
                                continue;
                            case 104:
                                this.playerNumber_ = codedInputStream.readInt32();
                                continue;
                            case 112:
                                this.seatsNumber_ = codedInputStream.readInt32();
                                continue;
                            case 120:
                                this.state_ = codedInputStream.readEnum();
                                continue;
                            case 128:
                                this.leader_ = codedInputStream.readInt32();
                                continue;
                            case 136:
                                this.playerSeconds_ = codedInputStream.readInt32();
                                continue;
                            case 144:
                                this.elite_ = codedInputStream.readBool();
                                continue;
                            case 152:
                                this.fastMode_ = codedInputStream.readBool();
                                continue;
                            case 160:
                                this.fightId_ = codedInputStream.readUInt64();
                                continue;
                            case 170:
                                BattleServerAddr battleServerAddr = this.battleServerAddr_;
                                BattleServerAddr.Builder builder5 = battleServerAddr != null ? battleServerAddr.toBuilder() : null;
                                BattleServerAddr battleServerAddr2 = (BattleServerAddr) codedInputStream.readMessage(BattleServerAddr.parser(), extensionRegistryLite);
                                this.battleServerAddr_ = battleServerAddr2;
                                if (builder5 != null) {
                                    builder5.mergeFrom((BattleServerAddr.Builder) battleServerAddr2);
                                    this.battleServerAddr_ = builder5.buildPartial();
                                } else {
                                    continue;
                                }
                            case 176:
                                this.createAt_ = codedInputStream.readInt64();
                                continue;
                            case 184:
                                this.silent_ = codedInputStream.readBool();
                                continue;
                            case 192:
                                this.playTimestamp_ = codedInputStream.readInt64();
                                continue;
                            case 200:
                                this.gameType_ = codedInputStream.readEnum();
                                continue;
                            case 208:
                                this.battleArea_ = codedInputStream.readEnum();
                                continue;
                            case 218:
                                this.gameName_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            case Opcodes.SHL_INT_LIT8 /* 224 */:
                                this.collectionId_ = codedInputStream.readInt32();
                                continue;
                            case 232:
                                this.allowPCJoin_ = codedInputStream.readBool();
                                continue;
                            case 240:
                                this.openFastModeBtn_ = codedInputStream.readBool();
                                continue;
                            case 248:
                                this.disableMobileJoin_ = codedInputStream.readBool();
                                continue;
                            case 256:
                                this.createByUser_ = codedInputStream.readInt32();
                                continue;
                            case 266:
                                this.chatRoomId_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 272:
                                this.roomCategory_ = codedInputStream.readEnum();
                                continue;
                            case 280:
                                this.openBattleScore_ = codedInputStream.readBool();
                                continue;
                            default:
                                if (!codedInputStream.skipField(readTag)) {
                                    break;
                                } else {
                                    continue;
                                }
                        }
                        r1 = true;
                    } catch (InvalidProtocolBufferException e5) {
                        throw new RuntimeException(e5.setUnfinishedMessage(this));
                    } catch (IOException e6) {
                        throw new RuntimeException(new InvalidProtocolBufferException(e6.getMessage()).setUnfinishedMessage(this));
                    }
                }
                break;
            case 7:
                break;
            case 8:
                if (PARSER == null) {
                    synchronized (GameRoom.class) {
                        if (PARSER == null) {
                            PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                        }
                    }
                }
                return PARSER;
            default:
                throw new UnsupportedOperationException();
        }
        return DEFAULT_INSTANCE;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public boolean getAllowPCJoin() {
        return this.allowPCJoin_;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public boolean getAllowPeripheralJoin() {
        return this.allowPeripheralJoin_;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public boolean getAllowSpectatorJoin() {
        return this.allowSpectatorJoin_;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public BattleArea getBattleArea() {
        BattleArea forNumber = BattleArea.forNumber(this.battleArea_);
        return forNumber == null ? BattleArea.UNRECOGNIZED : forNumber;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public int getBattleAreaValue() {
        return this.battleArea_;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public BattleServerAddr getBattleServerAddr() {
        BattleServerAddr battleServerAddr = this.battleServerAddr_;
        return battleServerAddr == null ? BattleServerAddr.getDefaultInstance() : battleServerAddr;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public int getChallengeCoins() {
        return this.challengeCoins_;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public String getChatRoomId() {
        return this.chatRoomId_;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public ByteString getChatRoomIdBytes() {
        return ByteString.copyFromUtf8(this.chatRoomId_);
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public int getCollectionId() {
        return this.collectionId_;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public long getCreateAt() {
        return this.createAt_;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public int getCreateByUser() {
        return this.createByUser_;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public boolean getDisableMobileJoin() {
        return this.disableMobileJoin_;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public boolean getElite() {
        return this.elite_;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public boolean getFastMode() {
        return this.fastMode_;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public long getFightId() {
        return this.fightId_;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public long getGameId() {
        return this.gameId_;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public String getGameName() {
        return this.gameName_;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public ByteString getGameNameBytes() {
        return ByteString.copyFromUtf8(this.gameName_);
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public GameType getGameType() {
        GameType forNumber = GameType.forNumber(this.gameType_);
        return forNumber == null ? GameType.UNRECOGNIZED : forNumber;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public int getGameTypeValue() {
        return this.gameType_;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public boolean getHasJoinPassword() {
        return this.hasJoinPassword_;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public int getLeader() {
        return this.leader_;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public boolean getOpenBattleScore() {
        return this.openBattleScore_;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public boolean getOpenFastModeBtn() {
        return this.openFastModeBtn_;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public RoomPosition getP1() {
        RoomPosition roomPosition = this.p1_;
        return roomPosition == null ? RoomPosition.getDefaultInstance() : roomPosition;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public RoomPosition getP2() {
        RoomPosition roomPosition = this.p2_;
        return roomPosition == null ? RoomPosition.getDefaultInstance() : roomPosition;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public RoomPosition getP3() {
        RoomPosition roomPosition = this.p3_;
        return roomPosition == null ? RoomPosition.getDefaultInstance() : roomPosition;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public RoomPosition getP4() {
        RoomPosition roomPosition = this.p4_;
        return roomPosition == null ? RoomPosition.getDefaultInstance() : roomPosition;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public String getPassword() {
        return this.password_;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public ByteString getPasswordBytes() {
        return ByteString.copyFromUtf8(this.password_);
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public long getPlayTimestamp() {
        return this.playTimestamp_;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public int getPlayerNumber() {
        return this.playerNumber_;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public int getPlayerSeconds() {
        return this.playerSeconds_;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public RoomCategory getRoomCategory() {
        RoomCategory forNumber = RoomCategory.forNumber(this.roomCategory_);
        return forNumber == null ? RoomCategory.UNRECOGNIZED : forNumber;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public int getRoomCategoryValue() {
        return this.roomCategory_;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public int getRoomId() {
        return this.roomId_;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public int getSeatsNumber() {
        return this.seatsNumber_;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int i5 = this.roomId_;
        int computeInt32Size = i5 != 0 ? 0 + CodedOutputStream.computeInt32Size(1, i5) : 0;
        long j4 = this.gameId_;
        if (j4 != 0) {
            computeInt32Size += CodedOutputStream.computeInt64Size(2, j4);
        }
        if (!this.password_.isEmpty()) {
            computeInt32Size += CodedOutputStream.computeStringSize(3, getPassword());
        }
        boolean z4 = this.hasJoinPassword_;
        if (z4) {
            computeInt32Size += CodedOutputStream.computeBoolSize(4, z4);
        }
        boolean z5 = this.allowSpectatorJoin_;
        if (z5) {
            computeInt32Size += CodedOutputStream.computeBoolSize(5, z5);
        }
        boolean z6 = this.allowPeripheralJoin_;
        if (z6) {
            computeInt32Size += CodedOutputStream.computeBoolSize(6, z6);
        }
        int i6 = this.spectatorNumber_;
        if (i6 != 0) {
            computeInt32Size += CodedOutputStream.computeInt32Size(7, i6);
        }
        if (this.p1_ != null) {
            computeInt32Size += CodedOutputStream.computeMessageSize(8, getP1());
        }
        if (this.p2_ != null) {
            computeInt32Size += CodedOutputStream.computeMessageSize(9, getP2());
        }
        if (this.p3_ != null) {
            computeInt32Size += CodedOutputStream.computeMessageSize(10, getP3());
        }
        if (this.p4_ != null) {
            computeInt32Size += CodedOutputStream.computeMessageSize(11, getP4());
        }
        int i7 = this.challengeCoins_;
        if (i7 != 0) {
            computeInt32Size += CodedOutputStream.computeInt32Size(12, i7);
        }
        int i8 = this.playerNumber_;
        if (i8 != 0) {
            computeInt32Size += CodedOutputStream.computeInt32Size(13, i8);
        }
        int i9 = this.seatsNumber_;
        if (i9 != 0) {
            computeInt32Size += CodedOutputStream.computeInt32Size(14, i9);
        }
        if (this.state_ != RoomState.EMPTY.getNumber()) {
            computeInt32Size += CodedOutputStream.computeEnumSize(15, this.state_);
        }
        int i10 = this.leader_;
        if (i10 != 0) {
            computeInt32Size += CodedOutputStream.computeInt32Size(16, i10);
        }
        int i11 = this.playerSeconds_;
        if (i11 != 0) {
            computeInt32Size += CodedOutputStream.computeInt32Size(17, i11);
        }
        boolean z7 = this.elite_;
        if (z7) {
            computeInt32Size += CodedOutputStream.computeBoolSize(18, z7);
        }
        boolean z8 = this.fastMode_;
        if (z8) {
            computeInt32Size += CodedOutputStream.computeBoolSize(19, z8);
        }
        long j5 = this.fightId_;
        if (j5 != 0) {
            computeInt32Size += CodedOutputStream.computeUInt64Size(20, j5);
        }
        if (this.battleServerAddr_ != null) {
            computeInt32Size += CodedOutputStream.computeMessageSize(21, getBattleServerAddr());
        }
        long j6 = this.createAt_;
        if (j6 != 0) {
            computeInt32Size += CodedOutputStream.computeInt64Size(22, j6);
        }
        boolean z9 = this.silent_;
        if (z9) {
            computeInt32Size += CodedOutputStream.computeBoolSize(23, z9);
        }
        long j7 = this.playTimestamp_;
        if (j7 != 0) {
            computeInt32Size += CodedOutputStream.computeInt64Size(24, j7);
        }
        if (this.gameType_ != GameType.FIGHT.getNumber()) {
            computeInt32Size += CodedOutputStream.computeEnumSize(25, this.gameType_);
        }
        if (this.battleArea_ != BattleArea.ALL.getNumber()) {
            computeInt32Size += CodedOutputStream.computeEnumSize(26, this.battleArea_);
        }
        if (!this.gameName_.isEmpty()) {
            computeInt32Size += CodedOutputStream.computeStringSize(27, getGameName());
        }
        int i12 = this.collectionId_;
        if (i12 != 0) {
            computeInt32Size += CodedOutputStream.computeInt32Size(28, i12);
        }
        boolean z10 = this.allowPCJoin_;
        if (z10) {
            computeInt32Size += CodedOutputStream.computeBoolSize(29, z10);
        }
        boolean z11 = this.openFastModeBtn_;
        if (z11) {
            computeInt32Size += CodedOutputStream.computeBoolSize(30, z11);
        }
        boolean z12 = this.disableMobileJoin_;
        if (z12) {
            computeInt32Size += CodedOutputStream.computeBoolSize(31, z12);
        }
        int i13 = this.createByUser_;
        if (i13 != 0) {
            computeInt32Size += CodedOutputStream.computeInt32Size(32, i13);
        }
        if (!this.chatRoomId_.isEmpty()) {
            computeInt32Size += CodedOutputStream.computeStringSize(33, getChatRoomId());
        }
        if (this.roomCategory_ != RoomCategory.NORMAL.getNumber()) {
            computeInt32Size += CodedOutputStream.computeEnumSize(34, this.roomCategory_);
        }
        boolean z13 = this.openBattleScore_;
        if (z13) {
            computeInt32Size += CodedOutputStream.computeBoolSize(35, z13);
        }
        this.memoizedSerializedSize = computeInt32Size;
        return computeInt32Size;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public boolean getSilent() {
        return this.silent_;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public int getSpectatorNumber() {
        return this.spectatorNumber_;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public RoomState getState() {
        RoomState forNumber = RoomState.forNumber(this.state_);
        return forNumber == null ? RoomState.UNRECOGNIZED : forNumber;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public int getStateValue() {
        return this.state_;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public boolean hasBattleServerAddr() {
        return this.battleServerAddr_ != null;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public boolean hasP1() {
        return this.p1_ != null;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public boolean hasP2() {
        return this.p2_ != null;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public boolean hasP3() {
        return this.p3_ != null;
    }

    @Override // com.papa91.battle.protocol.GameRoomOrBuilder
    public boolean hasP4() {
        return this.p4_ != null;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i4 = this.roomId_;
        if (i4 != 0) {
            codedOutputStream.writeInt32(1, i4);
        }
        long j4 = this.gameId_;
        if (j4 != 0) {
            codedOutputStream.writeInt64(2, j4);
        }
        if (!this.password_.isEmpty()) {
            codedOutputStream.writeString(3, getPassword());
        }
        boolean z4 = this.hasJoinPassword_;
        if (z4) {
            codedOutputStream.writeBool(4, z4);
        }
        boolean z5 = this.allowSpectatorJoin_;
        if (z5) {
            codedOutputStream.writeBool(5, z5);
        }
        boolean z6 = this.allowPeripheralJoin_;
        if (z6) {
            codedOutputStream.writeBool(6, z6);
        }
        int i5 = this.spectatorNumber_;
        if (i5 != 0) {
            codedOutputStream.writeInt32(7, i5);
        }
        if (this.p1_ != null) {
            codedOutputStream.writeMessage(8, getP1());
        }
        if (this.p2_ != null) {
            codedOutputStream.writeMessage(9, getP2());
        }
        if (this.p3_ != null) {
            codedOutputStream.writeMessage(10, getP3());
        }
        if (this.p4_ != null) {
            codedOutputStream.writeMessage(11, getP4());
        }
        int i6 = this.challengeCoins_;
        if (i6 != 0) {
            codedOutputStream.writeInt32(12, i6);
        }
        int i7 = this.playerNumber_;
        if (i7 != 0) {
            codedOutputStream.writeInt32(13, i7);
        }
        int i8 = this.seatsNumber_;
        if (i8 != 0) {
            codedOutputStream.writeInt32(14, i8);
        }
        if (this.state_ != RoomState.EMPTY.getNumber()) {
            codedOutputStream.writeEnum(15, this.state_);
        }
        int i9 = this.leader_;
        if (i9 != 0) {
            codedOutputStream.writeInt32(16, i9);
        }
        int i10 = this.playerSeconds_;
        if (i10 != 0) {
            codedOutputStream.writeInt32(17, i10);
        }
        boolean z7 = this.elite_;
        if (z7) {
            codedOutputStream.writeBool(18, z7);
        }
        boolean z8 = this.fastMode_;
        if (z8) {
            codedOutputStream.writeBool(19, z8);
        }
        long j5 = this.fightId_;
        if (j5 != 0) {
            codedOutputStream.writeUInt64(20, j5);
        }
        if (this.battleServerAddr_ != null) {
            codedOutputStream.writeMessage(21, getBattleServerAddr());
        }
        long j6 = this.createAt_;
        if (j6 != 0) {
            codedOutputStream.writeInt64(22, j6);
        }
        boolean z9 = this.silent_;
        if (z9) {
            codedOutputStream.writeBool(23, z9);
        }
        long j7 = this.playTimestamp_;
        if (j7 != 0) {
            codedOutputStream.writeInt64(24, j7);
        }
        if (this.gameType_ != GameType.FIGHT.getNumber()) {
            codedOutputStream.writeEnum(25, this.gameType_);
        }
        if (this.battleArea_ != BattleArea.ALL.getNumber()) {
            codedOutputStream.writeEnum(26, this.battleArea_);
        }
        if (!this.gameName_.isEmpty()) {
            codedOutputStream.writeString(27, getGameName());
        }
        int i11 = this.collectionId_;
        if (i11 != 0) {
            codedOutputStream.writeInt32(28, i11);
        }
        boolean z10 = this.allowPCJoin_;
        if (z10) {
            codedOutputStream.writeBool(29, z10);
        }
        boolean z11 = this.openFastModeBtn_;
        if (z11) {
            codedOutputStream.writeBool(30, z11);
        }
        boolean z12 = this.disableMobileJoin_;
        if (z12) {
            codedOutputStream.writeBool(31, z12);
        }
        int i12 = this.createByUser_;
        if (i12 != 0) {
            codedOutputStream.writeInt32(32, i12);
        }
        if (!this.chatRoomId_.isEmpty()) {
            codedOutputStream.writeString(33, getChatRoomId());
        }
        if (this.roomCategory_ != RoomCategory.NORMAL.getNumber()) {
            codedOutputStream.writeEnum(34, this.roomCategory_);
        }
        boolean z13 = this.openBattleScore_;
        if (z13) {
            codedOutputStream.writeBool(35, z13);
        }
    }

    public static Builder newBuilder(GameRoom gameRoom) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom((Builder) gameRoom);
    }

    public static GameRoom parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GameRoom) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GameRoom parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GameRoom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static GameRoom parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (GameRoom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBattleServerAddr(BattleServerAddr.Builder builder) {
        this.battleServerAddr_ = builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setP1(RoomPosition.Builder builder) {
        this.p1_ = builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setP2(RoomPosition.Builder builder) {
        this.p2_ = builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setP3(RoomPosition.Builder builder) {
        this.p3_ = builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setP4(RoomPosition.Builder builder) {
        this.p4_ = builder.build();
    }

    public static GameRoom parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GameRoom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static GameRoom parseFrom(InputStream inputStream) throws IOException {
        return (GameRoom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GameRoom parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GameRoom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GameRoom parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GameRoom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static GameRoom parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GameRoom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
