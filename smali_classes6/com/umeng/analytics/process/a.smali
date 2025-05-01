.class interface abstract Lcom/umeng/analytics/process/a;
.super Ljava/lang/Object;
.source "DBConstant.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/analytics/process/a$a;
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/String;

.field public static final b:Ljava/lang/String; = "id"

.field public static final c:Ljava/lang/String;

.field public static final d:Ljava/lang/String; = ".db"

.field public static final e:Ljava/lang/String;

.field public static final f:I = 0x1

.field public static final g:I = 0x1

.field public static final h:Ljava/lang/String; = "_main_"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/umeng/analytics/pro/aw;->b()Lcom/umeng/analytics/pro/aw;

    move-result-object v0

    const-string v1, "subp"

    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/aw;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/umeng/analytics/process/a;->a:Ljava/lang/String;

    .line 2
    invoke-static {}, Lcom/umeng/analytics/pro/aw;->b()Lcom/umeng/analytics/pro/aw;

    move-result-object v0

    const-string v1, "subua"

    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/aw;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/umeng/analytics/process/a;->c:Ljava/lang/String;

    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "%s"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ".db"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/umeng/analytics/process/a;->e:Ljava/lang/String;

    return-void
.end method
