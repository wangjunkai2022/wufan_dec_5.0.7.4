.class public Lcom/umeng/analytics/pro/aw;
.super Ljava/lang/Object;
.source "PathCenter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/analytics/pro/aw$a;
    }
.end annotation


# static fields
.field public static final A:Ljava/lang/String; = "rtd"

.field public static final B:Ljava/lang/String; = "lepd"

.field public static final C:Ljava/lang/String; = "ccfg"

.field private static D:Ljava/util/Map; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static E:Ljava/lang/String; = null

.field public static final a:Ljava/lang/String; = "env"

.field public static final b:Ljava/lang/String; = "exp"

.field public static final c:Ljava/lang/String; = "imp"

.field public static final d:Ljava/lang/String; = "ua"

.field public static final e:Ljava/lang/String; = "zc"

.field public static final f:Ljava/lang/String; = "id"

.field public static final g:Ljava/lang/String; = "zf"

.field public static final h:Ljava/lang/String; = "exid"

.field public static final i:Ljava/lang/String; = "ucc"

.field public static final j:Ljava/lang/String; = "ugc"

.field public static final k:Ljava/lang/String; = "usi"

.field public static final l:Ljava/lang/String; = "uso"

.field public static final m:Ljava/lang/String; = "user"

.field public static final n:Ljava/lang/String; = "uspi"

.field public static final o:Ljava/lang/String; = "dtfn"

.field public static final p:Ljava/lang/String; = "pr"

.field public static final q:Ljava/lang/String; = "upg"

.field public static final r:Ljava/lang/String; = "pri"

.field public static final s:Ljava/lang/String; = "probe"

.field public static final t:Ljava/lang/String; = "bl"

.field public static final u:Ljava/lang/String; = "wl"

.field public static final v:Ljava/lang/String; = "subp"

.field public static final w:Ljava/lang/String; = "subua"

.field public static final x:Ljava/lang/String; = "sta"

.field public static final y:Ljava/lang/String; = "emi"

.field public static final z:Ljava/lang/String; = "sli"


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/umeng/analytics/pro/aw;->D:Ljava/util/Map;

    const-string v1, ""

    .line 2
    sput-object v1, Lcom/umeng/analytics/pro/aw;->E:Ljava/lang/String;

    const-string v2, "env"

    const-string v3, "envelope"

    .line 3
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    sget-object v0, Lcom/umeng/analytics/pro/aw;->D:Ljava/util/Map;

    const-string v2, "exp"

    const-string v3, ".umeng"

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    sget-object v0, Lcom/umeng/analytics/pro/aw;->D:Ljava/util/Map;

    const-string v2, "imp"

    const-string v3, ".imprint"

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    sget-object v0, Lcom/umeng/analytics/pro/aw;->D:Ljava/util/Map;

    const-string v2, "ua"

    const-string v3, "ua.db"

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    sget-object v0, Lcom/umeng/analytics/pro/aw;->D:Ljava/util/Map;

    const-string v2, "zc"

    const-string v3, "umeng_zero_cache.db"

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    sget-object v0, Lcom/umeng/analytics/pro/aw;->D:Ljava/util/Map;

    const-string v2, "id"

    const-string v3, "umeng_it.cache"

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    sget-object v0, Lcom/umeng/analytics/pro/aw;->D:Ljava/util/Map;

    const-string v2, "zf"

    const-string v3, "umeng_zcfg_flag"

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    sget-object v0, Lcom/umeng/analytics/pro/aw;->D:Ljava/util/Map;

    const-string v2, "exid"

    const-string v3, "exid.dat"

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    sget-object v0, Lcom/umeng/analytics/pro/aw;->D:Ljava/util/Map;

    const-string v2, "ucc"

    const-string v3, "umeng_common_config"

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    sget-object v0, Lcom/umeng/analytics/pro/aw;->D:Ljava/util/Map;

    const-string v2, "ugc"

    const-string v3, "umeng_general_config"

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    sget-object v0, Lcom/umeng/analytics/pro/aw;->D:Ljava/util/Map;

    const-string v2, "usi"

    const-string v3, "um_session_id"

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    sget-object v0, Lcom/umeng/analytics/pro/aw;->D:Ljava/util/Map;

    const-string v2, "uso"

    const-string v3, "umeng_sp_oaid"

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    sget-object v0, Lcom/umeng/analytics/pro/aw;->D:Ljava/util/Map;

    const-string v2, "user"

    const-string v3, "mobclick_agent_user_"

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    sget-object v0, Lcom/umeng/analytics/pro/aw;->D:Ljava/util/Map;

    const-string v2, "uspi"

    const-string v3, "umeng_subprocess_info"

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    sget-object v0, Lcom/umeng/analytics/pro/aw;->D:Ljava/util/Map;

    const-string v2, "dtfn"

    const-string v3, "delayed_transmission_flag_new"

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    sget-object v0, Lcom/umeng/analytics/pro/aw;->D:Ljava/util/Map;

    const-string v2, "pr"

    const-string v3, "umeng_policy_result_flag"

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    sget-object v0, Lcom/umeng/analytics/pro/aw;->D:Ljava/util/Map;

    const-string v2, "upg"

    const-string v3, "um_policy_grant"

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    sget-object v0, Lcom/umeng/analytics/pro/aw;->D:Ljava/util/Map;

    const-string v2, "pri"

    const-string v3, "um_pri"

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    sget-object v0, Lcom/umeng/analytics/pro/aw;->D:Ljava/util/Map;

    const-string v2, "probe"

    const-string v3, "UM_PROBE_DATA"

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    sget-object v0, Lcom/umeng/analytics/pro/aw;->D:Ljava/util/Map;

    const-string v2, "bl"

    const-string v3, "ekv_bl"

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    sget-object v0, Lcom/umeng/analytics/pro/aw;->D:Ljava/util/Map;

    const-string v2, "wl"

    const-string v3, "ekv_wl"

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    sget-object v0, Lcom/umeng/analytics/pro/aw;->D:Ljava/util/Map;

    const-string v2, "subp"

    const-string v3, "subprocess/"

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    sget-object v0, Lcom/umeng/analytics/pro/aw;->D:Ljava/util/Map;

    const-string v2, "subua"

    const-string v3, "ua_"

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    sget-object v0, Lcom/umeng/analytics/pro/aw;->D:Ljava/util/Map;

    const-string v2, "sta"

    const-string v3, "stateless"

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    sget-object v0, Lcom/umeng/analytics/pro/aw;->D:Ljava/util/Map;

    const-string v2, "emi"

    const-string v3, ".emitter"

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    sget-object v0, Lcom/umeng/analytics/pro/aw;->D:Ljava/util/Map;

    const-string v2, "sli"

    const-string v3, "um_slmode_sp"

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    sget-object v0, Lcom/umeng/analytics/pro/aw;->D:Ljava/util/Map;

    const-string v2, "rtd"

    const-string v3, "um_rtd_conf"

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    sget-object v0, Lcom/umeng/analytics/pro/aw;->D:Ljava/util/Map;

    const-string v2, "lepd"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    sget-object v0, Lcom/umeng/analytics/pro/aw;->D:Ljava/util/Map;

    const-string v1, "ccfg"

    const-string v2, ".dmpvedpogjhejs.cfg"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/umeng/analytics/pro/aw$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/umeng/analytics/pro/aw;-><init>()V

    return-void
.end method

.method public static b()Lcom/umeng/analytics/pro/aw;
    .locals 1

    .line 8
    invoke-static {}, Lcom/umeng/analytics/pro/aw$a;->a()Lcom/umeng/analytics/pro/aw;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 1

    const-string v0, ""

    .line 6
    sput-object v0, Lcom/umeng/analytics/pro/aw;->E:Ljava/lang/String;

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    sget-object v0, Lcom/umeng/analytics/pro/aw;->E:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 3
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const-string v1, "_"

    const/4 v2, 0x3

    if-le v0, v2, :cond_2

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v3, 0x0

    invoke-virtual {p1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sput-object p1, Lcom/umeng/analytics/pro/aw;->E:Ljava/lang/String;

    goto :goto_0

    .line 5
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sput-object p1, Lcom/umeng/analytics/pro/aw;->E:Ljava/lang/String;

    :goto_0
    return-void
.end method

.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/aw;->D:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string p1, ""

    return-object p1

    .line 2
    :cond_0
    sget-object v0, Lcom/umeng/analytics/pro/aw;->D:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "exp"

    .line 3
    invoke-virtual {v1, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "imp"

    .line 4
    invoke-virtual {v1, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "emi"

    .line 5
    invoke-virtual {v1, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    .line 6
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/umeng/analytics/pro/aw;->E:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    .line 7
    :cond_2
    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "."

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Lcom/umeng/analytics/pro/aw;->E:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_1
    return-object p1
.end method
