.class final Lcom/mob/tools/utils/MobPersistence$c;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mob/tools/utils/MobPersistence;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field private a:J

.field private b:Ljava/lang/Object;


# direct methods
.method private constructor <init>(JLjava/lang/Object;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/mob/tools/utils/MobPersistence$c;->a:J

    .line 4
    iput-object p3, p0, Lcom/mob/tools/utils/MobPersistence$c;->b:Ljava/lang/Object;

    return-void
.end method

.method synthetic constructor <init>(JLjava/lang/Object;Lcom/mob/tools/utils/MobPersistence$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/mob/tools/utils/MobPersistence$c;-><init>(JLjava/lang/Object;)V

    return-void
.end method

.method static synthetic a(Lcom/mob/tools/utils/MobPersistence$c;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/mob/tools/utils/MobPersistence$c;->b:Ljava/lang/Object;

    return-object p0
.end method

.method private a()Z
    .locals 6

    .line 2
    iget-wide v0, p0, Lcom/mob/tools/utils/MobPersistence$c;->a:J

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    cmp-long v5, v0, v3

    if-nez v5, :cond_0

    return v2

    .line 3
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    cmp-long v5, v0, v3

    if-gtz v5, :cond_1

    const/4 v2, 0x1

    :cond_1
    return v2
.end method

.method static synthetic b(Lcom/mob/tools/utils/MobPersistence$c;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/mob/tools/utils/MobPersistence$c;->a()Z

    move-result p0

    return p0
.end method
