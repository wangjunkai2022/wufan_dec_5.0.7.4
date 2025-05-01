.class public Lcom/umeng/analytics/pro/ae;
.super Ljava/lang/Object;
.source "DelayedStartCondition.java"

# interfaces
.implements Lcom/umeng/analytics/pro/ac;


# instance fields
.field private a:J


# direct methods
.method public constructor <init>(J)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 2
    iput-wide v0, p0, Lcom/umeng/analytics/pro/ae;->a:J

    .line 3
    iput-wide p1, p0, Lcom/umeng/analytics/pro/ae;->a:J

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public b()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/ae;->a()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public c()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/umeng/analytics/pro/ae;->a:J

    return-wide v0
.end method
