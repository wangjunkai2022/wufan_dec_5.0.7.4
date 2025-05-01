.class Lcom/aggmoread/sdk/z/c/a/a/e/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/c/a/a/e/h$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/e/h;->b(Ljava/lang/String;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:J


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/e/h;Ljava/lang/String;J)V
    .locals 0

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/e/h$b;->a:Ljava/lang/String;

    iput-wide p3, p0, Lcom/aggmoread/sdk/z/c/a/a/e/h$b;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/SharedPreferences$Editor;)Z
    .locals 3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/e/h$b;->a:Ljava/lang/String;

    iget-wide v1, p0, Lcom/aggmoread/sdk/z/c/a/a/e/h$b;->b:J

    invoke-interface {p1, v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    const/4 p1, 0x0

    return p1
.end method
