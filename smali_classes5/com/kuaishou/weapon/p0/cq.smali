.class public Lcom/kuaishou/weapon/p0/cq;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kuaishou/weapon/p0/cq$a;
    }
.end annotation


# static fields
.field static a:Lcom/kuaishou/weapon/p0/cq;

.field static b:Lcom/kuaishou/weapon/p0/cq;

.field static c:Lcom/kuaishou/weapon/p0/cq;


# instance fields
.field private d:J

.field private e:Lcom/kuaishou/weapon/p0/cq$a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/kuaishou/weapon/p0/cq;->c()V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static c()V
    .locals 15

    .line 1
    new-instance v0, Lcom/kuaishou/weapon/p0/cq;

    invoke-direct {v0}, Lcom/kuaishou/weapon/p0/cq;-><init>()V

    sput-object v0, Lcom/kuaishou/weapon/p0/cq;->a:Lcom/kuaishou/weapon/p0/cq;

    .line 2
    new-instance v0, Lcom/kuaishou/weapon/p0/cq;

    invoke-direct {v0}, Lcom/kuaishou/weapon/p0/cq;-><init>()V

    sput-object v0, Lcom/kuaishou/weapon/p0/cq;->b:Lcom/kuaishou/weapon/p0/cq;

    .line 3
    new-instance v0, Lcom/kuaishou/weapon/p0/cq;

    invoke-direct {v0}, Lcom/kuaishou/weapon/p0/cq;-><init>()V

    sput-object v0, Lcom/kuaishou/weapon/p0/cq;->c:Lcom/kuaishou/weapon/p0/cq;

    .line 4
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->b:Lcom/kuaishou/weapon/p0/cq;

    sget-object v1, Lcom/kuaishou/weapon/p0/cq$a;->a:Lcom/kuaishou/weapon/p0/cq$a;

    invoke-virtual {v0, v1}, Lcom/kuaishou/weapon/p0/cq;->a(Lcom/kuaishou/weapon/p0/cq$a;)V

    .line 5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    invoke-static {}, Lcom/kuaishou/weapon/p0/cr;->a()Z

    move-result v2

    const-string v9, " is not supported now : ("

    const-string v10, "API LEVEL: "

    const-wide/16 v11, 0x18

    const-wide/16 v7, 0x4

    const-wide/16 v13, 0x28

    const-wide/16 v5, 0x20

    if-eqz v2, :cond_0

    .line 7
    sget-object v1, Lcom/kuaishou/weapon/p0/cq;->a:Lcom/kuaishou/weapon/p0/cq;

    sget-object v2, Lcom/kuaishou/weapon/p0/cq$a;->b:Lcom/kuaishou/weapon/p0/cq$a;

    invoke-virtual {v1, v2}, Lcom/kuaishou/weapon/p0/cq;->a(Lcom/kuaishou/weapon/p0/cq$a;)V

    .line 8
    sget-object v1, Lcom/kuaishou/weapon/p0/cq;->c:Lcom/kuaishou/weapon/p0/cq;

    invoke-virtual {v1, v2}, Lcom/kuaishou/weapon/p0/cq;->a(Lcom/kuaishou/weapon/p0/cq$a;)V

    const-wide/16 v3, 0x30

    packed-switch v0, :pswitch_data_0

    .line 9
    :pswitch_0
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 10
    :pswitch_1
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->a:Lcom/kuaishou/weapon/p0/cq;

    invoke-virtual {v0, v5, v6}, Lcom/kuaishou/weapon/p0/cq;->a(J)V

    .line 11
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->c:Lcom/kuaishou/weapon/p0/cq;

    invoke-virtual {v0, v11, v12}, Lcom/kuaishou/weapon/p0/cq;->a(J)V

    .line 12
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->b:Lcom/kuaishou/weapon/p0/cq;

    invoke-virtual {v0, v7, v8}, Lcom/kuaishou/weapon/p0/cq;->a(J)V

    return-void

    .line 13
    :pswitch_2
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->a:Lcom/kuaishou/weapon/p0/cq;

    invoke-virtual {v0, v13, v14}, Lcom/kuaishou/weapon/p0/cq;->a(J)V

    .line 14
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->c:Lcom/kuaishou/weapon/p0/cq;

    invoke-virtual {v0, v5, v6}, Lcom/kuaishou/weapon/p0/cq;->a(J)V

    .line 15
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->b:Lcom/kuaishou/weapon/p0/cq;

    invoke-virtual {v0, v7, v8}, Lcom/kuaishou/weapon/p0/cq;->a(J)V

    return-void

    .line 16
    :pswitch_3
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->a:Lcom/kuaishou/weapon/p0/cq;

    invoke-virtual {v0, v3, v4}, Lcom/kuaishou/weapon/p0/cq;->a(J)V

    .line 17
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->c:Lcom/kuaishou/weapon/p0/cq;

    invoke-virtual {v0, v13, v14}, Lcom/kuaishou/weapon/p0/cq;->a(J)V

    .line 18
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->b:Lcom/kuaishou/weapon/p0/cq;

    invoke-virtual {v0, v7, v8}, Lcom/kuaishou/weapon/p0/cq;->a(J)V

    return-void

    .line 19
    :pswitch_4
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->a:Lcom/kuaishou/weapon/p0/cq;

    invoke-virtual {v0, v3, v4}, Lcom/kuaishou/weapon/p0/cq;->a(J)V

    .line 20
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->c:Lcom/kuaishou/weapon/p0/cq;

    invoke-virtual {v0, v13, v14}, Lcom/kuaishou/weapon/p0/cq;->a(J)V

    .line 21
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->b:Lcom/kuaishou/weapon/p0/cq;

    const-wide/16 v1, 0xc

    invoke-virtual {v0, v1, v2}, Lcom/kuaishou/weapon/p0/cq;->a(J)V

    return-void

    .line 22
    :pswitch_5
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->a:Lcom/kuaishou/weapon/p0/cq;

    const-wide/16 v1, 0x34

    invoke-virtual {v0, v1, v2}, Lcom/kuaishou/weapon/p0/cq;->a(J)V

    .line 23
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->c:Lcom/kuaishou/weapon/p0/cq;

    const-wide/16 v1, 0x2c

    invoke-virtual {v0, v1, v2}, Lcom/kuaishou/weapon/p0/cq;->a(J)V

    .line 24
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->b:Lcom/kuaishou/weapon/p0/cq;

    const-wide/16 v1, 0x14

    invoke-virtual {v0, v1, v2}, Lcom/kuaishou/weapon/p0/cq;->a(J)V

    return-void

    .line 25
    :pswitch_6
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->a:Lcom/kuaishou/weapon/p0/cq;

    invoke-virtual {v0, v13, v14}, Lcom/kuaishou/weapon/p0/cq;->a(J)V

    .line 26
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->a:Lcom/kuaishou/weapon/p0/cq;

    invoke-virtual {v0, v2}, Lcom/kuaishou/weapon/p0/cq;->a(Lcom/kuaishou/weapon/p0/cq$a;)V

    .line 27
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->c:Lcom/kuaishou/weapon/p0/cq;

    invoke-virtual {v0, v5, v6}, Lcom/kuaishou/weapon/p0/cq;->a(J)V

    .line 28
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->c:Lcom/kuaishou/weapon/p0/cq;

    invoke-virtual {v0, v2}, Lcom/kuaishou/weapon/p0/cq;->a(Lcom/kuaishou/weapon/p0/cq$a;)V

    .line 29
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->b:Lcom/kuaishou/weapon/p0/cq;

    const-wide/16 v1, 0x38

    invoke-virtual {v0, v1, v2}, Lcom/kuaishou/weapon/p0/cq;->a(J)V

    return-void

    .line 30
    :pswitch_7
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->a:Lcom/kuaishou/weapon/p0/cq;

    invoke-virtual {v0, v5, v6}, Lcom/kuaishou/weapon/p0/cq;->a(J)V

    .line 31
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->b:Lcom/kuaishou/weapon/p0/cq;

    const-wide/16 v1, 0x1c

    invoke-virtual {v0, v1, v2}, Lcom/kuaishou/weapon/p0/cq;->a(J)V

    return-void

    .line 32
    :cond_0
    sget-object v2, Lcom/kuaishou/weapon/p0/cq;->a:Lcom/kuaishou/weapon/p0/cq;

    invoke-virtual {v2, v1}, Lcom/kuaishou/weapon/p0/cq;->a(Lcom/kuaishou/weapon/p0/cq$a;)V

    .line 33
    sget-object v2, Lcom/kuaishou/weapon/p0/cq;->c:Lcom/kuaishou/weapon/p0/cq;

    invoke-virtual {v2, v1}, Lcom/kuaishou/weapon/p0/cq;->a(Lcom/kuaishou/weapon/p0/cq$a;)V

    packed-switch v0, :pswitch_data_1

    .line 34
    :pswitch_8
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 35
    :pswitch_9
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->a:Lcom/kuaishou/weapon/p0/cq;

    invoke-virtual {v0, v11, v12}, Lcom/kuaishou/weapon/p0/cq;->a(J)V

    .line 36
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->c:Lcom/kuaishou/weapon/p0/cq;

    const-wide/16 v1, 0x14

    invoke-virtual {v0, v1, v2}, Lcom/kuaishou/weapon/p0/cq;->a(J)V

    .line 37
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->b:Lcom/kuaishou/weapon/p0/cq;

    invoke-virtual {v0, v7, v8}, Lcom/kuaishou/weapon/p0/cq;->a(J)V

    return-void

    .line 38
    :pswitch_a
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->a:Lcom/kuaishou/weapon/p0/cq;

    const-wide/16 v1, 0x1c

    invoke-virtual {v0, v1, v2}, Lcom/kuaishou/weapon/p0/cq;->a(J)V

    .line 39
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->c:Lcom/kuaishou/weapon/p0/cq;

    invoke-virtual {v0, v11, v12}, Lcom/kuaishou/weapon/p0/cq;->a(J)V

    .line 40
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->b:Lcom/kuaishou/weapon/p0/cq;

    invoke-virtual {v0, v7, v8}, Lcom/kuaishou/weapon/p0/cq;->a(J)V

    return-void

    :pswitch_b
    const-wide/16 v1, 0x1c

    .line 41
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->a:Lcom/kuaishou/weapon/p0/cq;

    invoke-virtual {v0, v5, v6}, Lcom/kuaishou/weapon/p0/cq;->a(J)V

    .line 42
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->c:Lcom/kuaishou/weapon/p0/cq;

    invoke-virtual {v0, v1, v2}, Lcom/kuaishou/weapon/p0/cq;->a(J)V

    .line 43
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->b:Lcom/kuaishou/weapon/p0/cq;

    invoke-virtual {v0, v7, v8}, Lcom/kuaishou/weapon/p0/cq;->a(J)V

    return-void

    .line 44
    :pswitch_c
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->a:Lcom/kuaishou/weapon/p0/cq;

    const-wide/16 v1, 0x24

    invoke-virtual {v0, v1, v2}, Lcom/kuaishou/weapon/p0/cq;->a(J)V

    .line 45
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->c:Lcom/kuaishou/weapon/p0/cq;

    invoke-virtual {v0, v5, v6}, Lcom/kuaishou/weapon/p0/cq;->a(J)V

    .line 46
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->b:Lcom/kuaishou/weapon/p0/cq;

    const-wide/16 v1, 0xc

    invoke-virtual {v0, v1, v2}, Lcom/kuaishou/weapon/p0/cq;->a(J)V

    return-void

    .line 47
    :pswitch_d
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->a:Lcom/kuaishou/weapon/p0/cq;

    const-wide/16 v1, 0x2c

    invoke-virtual {v0, v1, v2}, Lcom/kuaishou/weapon/p0/cq;->a(J)V

    .line 48
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->c:Lcom/kuaishou/weapon/p0/cq;

    invoke-virtual {v0, v13, v14}, Lcom/kuaishou/weapon/p0/cq;->a(J)V

    .line 49
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->b:Lcom/kuaishou/weapon/p0/cq;

    const-wide/16 v1, 0x14

    invoke-virtual {v0, v1, v2}, Lcom/kuaishou/weapon/p0/cq;->a(J)V

    return-void

    .line 50
    :pswitch_e
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->a:Lcom/kuaishou/weapon/p0/cq;

    invoke-virtual {v0, v13, v14}, Lcom/kuaishou/weapon/p0/cq;->a(J)V

    .line 51
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->a:Lcom/kuaishou/weapon/p0/cq;

    sget-object v1, Lcom/kuaishou/weapon/p0/cq$a;->b:Lcom/kuaishou/weapon/p0/cq$a;

    invoke-virtual {v0, v1}, Lcom/kuaishou/weapon/p0/cq;->a(Lcom/kuaishou/weapon/p0/cq$a;)V

    .line 52
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->c:Lcom/kuaishou/weapon/p0/cq;

    invoke-virtual {v0, v5, v6}, Lcom/kuaishou/weapon/p0/cq;->a(J)V

    .line 53
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->c:Lcom/kuaishou/weapon/p0/cq;

    invoke-virtual {v0, v1}, Lcom/kuaishou/weapon/p0/cq;->a(Lcom/kuaishou/weapon/p0/cq$a;)V

    .line 54
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->b:Lcom/kuaishou/weapon/p0/cq;

    const-wide/16 v1, 0x38

    invoke-virtual {v0, v1, v2}, Lcom/kuaishou/weapon/p0/cq;->a(J)V

    return-void

    .line 55
    :pswitch_f
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->a:Lcom/kuaishou/weapon/p0/cq;

    invoke-virtual {v0, v5, v6}, Lcom/kuaishou/weapon/p0/cq;->a(J)V

    .line 56
    sget-object v0, Lcom/kuaishou/weapon/p0/cq;->b:Lcom/kuaishou/weapon/p0/cq;

    const-wide/16 v1, 0x1c

    invoke-virtual {v0, v1, v2}, Lcom/kuaishou/weapon/p0/cq;->a(J)V

    return-void

    :pswitch_data_0
    .packed-switch 0x13
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x13
        :pswitch_f
        :pswitch_8
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_9
    .end packed-switch
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/kuaishou/weapon/p0/cq;->d:J

    return-wide v0
.end method

.method public a(J)V
    .locals 0

    .line 2
    iput-wide p1, p0, Lcom/kuaishou/weapon/p0/cq;->d:J

    return-void
.end method

.method public a(Lcom/kuaishou/weapon/p0/cq$a;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/kuaishou/weapon/p0/cq;->e:Lcom/kuaishou/weapon/p0/cq$a;

    return-void
.end method

.method public b()Lcom/kuaishou/weapon/p0/cq$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kuaishou/weapon/p0/cq;->e:Lcom/kuaishou/weapon/p0/cq$a;

    return-object v0
.end method
